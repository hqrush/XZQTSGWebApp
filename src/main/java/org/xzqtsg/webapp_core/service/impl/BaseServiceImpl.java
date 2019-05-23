package org.xzqtsg.webapp_core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.xzqtsg.webapp_core.dao.impl.BaseDAOImpl;
import org.xzqtsg.webapp_core.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private BaseDAOImpl<T> baseDAOImpl;

	@Override
	public void add(T entity) {
		baseDAOImpl.add(entity);
	}

	@Override
	public void deleteById(Long id) {
		baseDAOImpl.deleteById(id);
	}

	@Override
	public void update(T entity) {
		baseDAOImpl.update(entity);
	}

	@Override
	public T getById(Long id) {
		return baseDAOImpl.getById(id);
	}

	@Override
	public List<T> findAll() {
		return baseDAOImpl.findAll();
	}

}
