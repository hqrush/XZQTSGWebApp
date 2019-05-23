package org.xzqtsg.webapp_core.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.xzqtsg.webapp_core.dao.BaseDAO;

public class BaseDAOImpl<T> implements BaseDAO<T> {

	// 通过注入得到SessionFactory，要把它放到容器里才能注入，在具体的实现类上声明@Repository
	@Resource
	private SessionFactory sessionFactory;

	private Class<T> clazz;

	// 构造函数使用反射技术得到T的真实类型
	@SuppressWarnings("unchecked")
	public BaseDAOImpl() {
		// 获取当前new类型的泛型的父类类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		// 获取第一个类型参数的真实类型，只有一个泛型参数，所以写0
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
		System.out.println("clazz--->" + clazz);
	}

	/**
	 * 获取当前可用的session对象,用protected修饰方便子类得到session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(T entity) {
		// 不需要自己关事务了，spring框架已经帮我们做了，我们用它的事务管理
		getSession().save(entity);
	}

	@Override
	public void deleteById(Long id) {
		Object obj = getById(id);
		if (obj != null) {
			getSession().delete(obj);
		}
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public T getById(Long id) {
		return (T) getSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		// 1、创建一个CriteriaBuilder
		// CriteriaBuilder builder = getSession().getCriteriaBuilder();
		// 2、获取 CriteriaQuery
		// CriteriaQuery<Admin> criteria = (CriteriaQuery<Admin>)
		// builder.createQuery(clazz);
		// 3、指定实体
		// criteria.from(clazz);
		// 4、执行查询 获取结果集
		// return (List<T>) getSession().createQuery(criteria).getResultList();
		return getSession().createQuery("FROM " + clazz.getSimpleName()).list();
	}

}
