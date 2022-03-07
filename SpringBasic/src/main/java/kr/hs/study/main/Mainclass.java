package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//config.xml�� �ε���Ų�� : ��ü�� �����ؼ� �����̳ʿ� �����Ѵ� 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1=(TestBean) ctx.getBean("t1");	
		System.out.println("t1:"+t1);
		//���� �ּҰ��� ���� //TestBean t2=(TestBean) ctx.getBean("t2");	
		TestBean t2 =ctx.getBean("t1",TestBean.class);
		System.out.println("t2:"+t2);
		
		ctx.close();
	}

}
