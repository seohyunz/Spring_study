package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanClassConfiguarlion;

public class ClassMain {

	public static void main(String[] args) {
		// BeanClassConfiguarlion.class 파일을 로딩해서 bean 등록
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(BeanClassConfiguarlion.class);
		
		
		TestBean1 obj1 = ctx.getBean("javabean1", TestBean1.class);
		System.out.println(obj1);
		
		TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
		System.out.println(obj2);
		
		
		ctx.close();
	}

}
