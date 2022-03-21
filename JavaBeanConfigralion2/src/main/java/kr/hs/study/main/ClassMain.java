package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
		System.out.println(obj1);
		System.out.println("___________________________________________");
		TestBean1 obj2 = ctx.getBean("new", TestBean1.class);
		System.out.println(obj2);
		System.out.println("___________________________________________");
		TestBean1 obj3 = ctx.getBean("java3", TestBean1.class);
		System.out.println(obj3);
		System.out.println("___________________________________________");
		TestBean1 obj4 = ctx.getBean("java4", TestBean1.class);
		System.out.println(obj4);
		
		
		ctx.close();
	}

}
