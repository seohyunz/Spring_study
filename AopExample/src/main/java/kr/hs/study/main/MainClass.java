package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.PrinMsg;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		PrinMsg obj1 = ctx.getBean("t1",PrinMsg.class);
		obj1.sayHello();
		obj1.sayHello2();
		
		
		ctx.close();

	}

}
