package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Person p1=new Test();
		
		Test obj1 = ctx.getBean("t1", Test.class);
		System.out.print(obj1.getP1());
		System.out.print(obj1.getP2());
		
		method(p1);
	
	}
	
	
	public static void method(Person cout) {
		cout.eat();
	}

}
