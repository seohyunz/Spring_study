package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("java1",TestBean1.class);
		System.out.println(obj1.getData1());
		System.out.println(obj1.getData2());
		System.out.println(obj1.getData3());
	
		TestBean1 obj2 = ctx.getBean("java2",TestBean1.class);
		System.out.println(obj2.getData1());
		System.out.println(obj2.getData2());
		System.out.println(obj2);
		
	}

}
