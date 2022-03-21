package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

//config.xml ���ϰ� �����ϴ� (bean ����)
@Configuration //(�� ������ Spring ��ü �������������̴�)

public class BeanClassConfiguarlion {
	@Bean  //�� ����
	
	//<bean id = "t1" class="kr.hs.study.beans.TestBean1"/>  
	
	public TestBean1 javabean1() {
		TestBean1 t1 = new TestBean1();
		return t1;  //<--t1��ü ���� return�� �޼ҵ� �̸����� �� 
					//��, t1�� ���̵� �ƴ϶� javabean1�� ���̵� �ȴ� 
					//�׷��� ���ο��� javabean1 ���� �����
		}

	
	@Bean
	public TestBean1 java2() {
		return new TestBean1();
	}



	
}
