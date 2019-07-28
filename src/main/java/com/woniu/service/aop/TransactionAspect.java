package com.woniu.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class TransactionAspect {
	@Autowired
	private SessionFactory sf;
	@Around("execution(* com.woniu.service.impl.DeptServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) {
		Session s=null;
		Object r=null;
		try {
			s=sf.getCurrentSession();
			s.beginTransaction();
			pjp.proceed();
			s.getTransaction().commit();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			s.getTransaction().rollback();
			throw new RuntimeException(e);
		}
		return r;
	}
}
