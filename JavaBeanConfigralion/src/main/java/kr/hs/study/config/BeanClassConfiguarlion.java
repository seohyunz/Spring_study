package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//config.xml 역하과 동일하다 (bean 생성)
@Configuration //(이 파일은 Spring 객체 생성설정파일이다)

public class BeanClassConfiguarlion {
	@Bean  //빈 생성
	
	//<bean id = "t1" class="kr.hs.study.beans.TestBean1"/>  
	
	public TestBean1 javabean1() {
		TestBean1 t1 = new TestBean1();
		return t1;  //<--t1객체 생성 return이 메소드 이름으로 됨 
					//즉, t1이 아이디가 아니라 javabean1이 아이디가 된다 
					//그래서 메인에서 javabean1 으로 써야함
		}

	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}



	
}
