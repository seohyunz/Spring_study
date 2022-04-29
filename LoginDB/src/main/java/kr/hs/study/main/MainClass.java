package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao = ctx.getBean(TestDAO.class);	
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setUserid("dldl");
		t1.setUsername("ssss");
		t1.setUserpass("12312313");
		dao.inset_db(t1);
		
		System.out.println("Inserted");
		ctx.close();
	}

}
