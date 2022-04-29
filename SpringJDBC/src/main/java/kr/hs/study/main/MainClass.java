package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Testbean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//dao 가져오기
		TestDAO dao= ctx.getBean(TestDAO.class);
		
		//TestBean 객체 t1 만들어서 10, Spring넣기
		Testbean t1 = new Testbean();
		t1.setData1(100);
		t1.setData2("Spring1");
		
		// dao의 inset_data 호출
		dao.insert_data(t1);
		
		Testbean t2 = new Testbean();
		t2.setData1(200);
		t2.setData2("Spring2");
		
		dao.insert_data(t2);
		
		System.out.println("Inserted");
		ctx.close();
	}

}
