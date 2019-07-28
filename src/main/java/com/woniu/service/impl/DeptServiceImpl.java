package com.woniu.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDao;
import com.woniu.domain.Dept;
import com.woniu.service.IDeptService;

@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	
	@Autowired
	private IDeptDao iDeptDao;
	
	@Override
	public void save(Dept dept) {
		// TODO Auto-generated method stub
		iDeptDao.save(dept);
	}

	@Override
	public void delete(Integer did) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Dept> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dept find(Integer did) {
		// TODO Auto-generated method stub
		return null;
	}

}
