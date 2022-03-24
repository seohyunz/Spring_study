package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;

@Configuration
public class BeanConfigClass {
	@Bean
	public TestBean2 java1() {
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	@Bean
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
}
