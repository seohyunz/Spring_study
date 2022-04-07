package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigJava;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj = ctx.getBean(TestBean1.class);
		System.out.println(obj.getClass());
		ctx.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigJava.class);
		TestBean2 t2 = ctx2.getBean(TestBean2.class);
		System.out.println(t2);
		
		ctx2.close();
		
		
		
	}

}
