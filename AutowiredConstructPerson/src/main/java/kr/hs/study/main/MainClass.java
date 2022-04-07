package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Test t1 = ctx.getBean("t1", Test.class);
		
		t1.pr();
	
	}
	
	
	

}
