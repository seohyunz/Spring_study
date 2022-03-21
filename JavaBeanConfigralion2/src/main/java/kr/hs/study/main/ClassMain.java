package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		ctx.close();
	}

}
