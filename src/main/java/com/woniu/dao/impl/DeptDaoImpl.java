package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDao;
import com.woniu.domain.Dept;

@Repository
public class DeptDaoImpl implements IDeptDao {
	@Autowired
	private SessionFactory sf;
	private Session getSession() {
		return sf.getCurrentSession();
	}
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		getSession().save(dept);
	}

	@Override
	public void delete(Integer did) {
		// TODO Auto-generated method stub
		Dept dept = getSession().get(Dept.class, did);
		getSession().delete(dept);
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		getSession().update(dept);
	}

	@Override
	public List<Dept> find() {
		// TODO Auto-generated method stub
		String hql="from dept";
		List<Dept> list = getSession().createQuery("hql").list();
		return list;
	}

	@Override
	public Dept find(Integer did) {
		// TODO Auto-generated method stub
		Dept dept = getSession().get(Dept.class, did);
		return dept;
	}

}
