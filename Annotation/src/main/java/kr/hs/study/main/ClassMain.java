package kr.hs.study.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean2 obj2 = ctx.getBean("xml2",TestBean2.class);
		System.out.println("data1: " + obj2.getDat1());
		
		
		
	
		
		System.out.println("+_________________________+");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean2 obj3 = ctx2.getBean("xml2",TestBean2.class);
		System.out.println(obj3.getDat1());
		
		
		
		
		ctx.close();
	}

}
