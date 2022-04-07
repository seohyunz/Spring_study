package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean3 obj3= ctx.getBean("t1",TestBean3.class);
		System.out.println(obj3.getData1());
		System.out.println(obj3.getData2());
		System.out.println(obj3.getData3());
		System.out.println(obj3.getData4());
		//System.out.println(obj3);
		
		ctx.close();
	}

}
