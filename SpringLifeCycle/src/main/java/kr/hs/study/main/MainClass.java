package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xml 로딩 TestBean1의 객체의 주소값 출력
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1  = ctx.getBean("t1",TestBean1.class);
		System.out.println("t1의 주소값"+t1);
		
		TestBean2 t2  = ctx.getBean("t2",TestBean2.class);
		System.out.println("t2의 주소값"+t2);
		
		TestBean2 t3  = ctx.getBean("t2",TestBean2.class);
		System.out.println("t3의 주소값"+t3);
		
	
		ctx.close();
		
		
	}

}
