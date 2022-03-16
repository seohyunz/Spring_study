package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.println(t1);
		t1.pr();
		
		System.out.println("_______________________");
		TestBean t2 = ctx.getBean("t2",TestBean.class);
		t2.pr();
		
		System.out.println("_______________________");
		TestBean t3 = ctx.getBean("t3",TestBean.class);
		t3.pr();
		
		
		System.out.println("_______________________");
		TestBean t4 = ctx.getBean("t4",TestBean.class);
		t4.pr();
		
		System.out.println("_______________________");
		TestBean t5 = ctx.getBean("t5",TestBean.class);
		t5.pr();
		
		System.out.println("_______________________");
		TestBean t6 = ctx.getBean("t6",TestBean.class);
		System.out.println(t6);
		
		
		
		
		
		ctx.close();
		
		
		
		
		
	}

}
