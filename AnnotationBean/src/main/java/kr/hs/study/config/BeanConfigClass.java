package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	//DataBean타입의 객체를 주입해야함 DataBean1,DataBean2 만들어서 에러해결
	@Bean
	public DataBean1 java3() {
		DataBean1 t3 = new DataBean1();
		return t3;
	}
	
	@Bean
	public DataBean2 java4() {
		DataBean2 t4 = new DataBean2();
		return t4;
	}
	
	@Bean
	public TestBean3 java5() {
		TestBean3 t5 = new TestBean3();
		t5.getData3();
		t5.getData4();
		
		return t5;
	}

}
