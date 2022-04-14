package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	@Bean
	public TestBean1 java1() { //빈 말들어주기
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	@Bean
	public TestBean3 java3() { 
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
	
	
	
}
