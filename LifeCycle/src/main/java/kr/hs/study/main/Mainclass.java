package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean1;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		DataBean1 obj = ctx.getBean("d1", DataBean1.class);
		//DataBean1의 기본생성자
		
		DataBean1 obj2 = ctx.getBean("d2", DataBean1.class);
		//DataBean1의 기본생성자
		
		DataBean1 obj3 = ctx.getBean("d3", DataBean1.class);
		
		DataBean1 obj4 = ctx.getBean("d4", DataBean1.class);
		
		System.out.println("d1:"+obj);
		System.out.println("d2:"+obj2);
		System.out.println("d3:"+obj3);
		System.out.println("obj4:"+obj4);
		
		
		ctx.close();
	}

}
