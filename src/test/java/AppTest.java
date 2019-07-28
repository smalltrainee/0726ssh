import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.woniu.dao.impl.DeptDaoImpl;
import com.woniu.domain.Dept;

@Component
public class AppTest {
	@Autowired
	SessionFactory sf;
	@Autowired
	private DeptDaoImpl deptServiceImpl;
	@Test
	public void test() throws Exception {
//		Configuration cfg=new Configuration();
//		cfg.configure("hibernate.cfg.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		IDeptService service = (IDeptService) ctx.getBean("deptServiceImpl");
//		SessionFactory bf = cfg.buildSessionFactory();
		
		
		//============================
//		Dept dept=new Dept();
//		dept.setDname("¿ª·¢²¿");
//		Emp emp=new Emp();
//		emp.setEname("ÎâÐûÒÇ");
//		dept.getEmps().add(emp);
//		s.save(dept);
		Dept dept=new Dept();
		dept.setDname("aaa");
		System.out.println(deptServiceImpl);
		deptServiceImpl.save(dept);
		//============================
		
	}
}
