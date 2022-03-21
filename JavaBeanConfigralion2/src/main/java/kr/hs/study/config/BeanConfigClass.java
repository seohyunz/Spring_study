package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
//이 파일은 bean을 만들라고 명령하는 설정파일 == config.xml
public class BeanConfigClass {
	@Bean //아래 메서드 실행한 애들 bean으로 만들어 컨테이너에 등록
	
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	 
	
	@Bean(name= "new") //Bean의 이름을 바꿈 java1 -> new 로 변경
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	@Lazy
	public TestBean1 java3() {
		return new TestBean1();
	}
	

	@Bean
	@Lazy
	@Scope
	public TestBean1 java4() {
		return new TestBean1();
	}
}
