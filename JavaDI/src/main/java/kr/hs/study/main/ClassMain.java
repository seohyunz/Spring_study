package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean4 obj4 = ctx.getBean("java4",TestBean4.class);
		System.out.println(obj4.getData1());
		System.out.println(obj4.getData2());
		System.out.println(obj4.getData3());
	
		System.out.println("_________________________________");
		TestBean4 obj5 = ctx.getBean("java5",TestBean4.class);
		System.out.println(obj5.getData1());
		System.out.println(obj5.getData2());
		System.out.println(obj5.getData3());
		
		
		ctx.close();
	}

}
