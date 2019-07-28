package com.woniu.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.service.IDeptService;

@Controller
public class DeptAction {
	@Autowired
	private IDeptService service;
	public String save() { 
		System.out.println("++++++++++");
		return null;
	}
}
