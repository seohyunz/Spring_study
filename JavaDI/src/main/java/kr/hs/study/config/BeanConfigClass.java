package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4(100,"Spring",new DataBean4()); //매개변수가 있는 생성자
		return t4;
	}
	
	//setterDI 사용
	@Bean
	public TestBean4 java5() {
		TestBean4 t5 = new TestBean4(); //기본생성자를 만들어서 에러를 없도록 해줌
		t5.setData1(200);
		t5.setData2("Spring");
		t5.setData3(new DataBean4()); //xml은 propoty name 해서 만듬
		return t5;
	}
	
}
