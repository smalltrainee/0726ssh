package com.woniu.dao;

import java.util.List;

import com.woniu.domain.Dept;

public interface IDeptDao {
	void save(Dept dept);
	void delete(Integer did);
	void update(Dept dept);
	List<Dept> find();
	Dept find(Integer did);
}
