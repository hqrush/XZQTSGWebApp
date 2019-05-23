package org.xzqtsg.webapp_core.dao;

import java.util.List;

public interface BaseDAO<T> {

	/**
	 * 保存实体
	 */
	void add(T entity);

	/**
	 * 删除实体
	 */
	void deleteById(Long id);

	/**
	 * 更新实体
	 * 
	 * @param 实体类
	 */
	void update(T entity);

	/**
	 * 按id查询
	 * 
	 */
	T getById(Long id);

	/**
	 * 查询所有
	 * 
	 */
	List<T> findAll();

}