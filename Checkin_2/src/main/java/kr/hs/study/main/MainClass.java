package kr.hs.study.main;

import java.util.concurrent.Flow.Publisher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext(); ctx.close();
		 */
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 obj1 = ctx2.getBean("t1", TestBean1.class);
			
		TestBean2 obj2 = ctx2.getBean("t2", TestBean2.class);

		TestBean3 obj3 = ctx2.getBean("t3", TestBean3.class);
		
		
		
		ctx2.close();
	}

}
