package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestBean1 {
	//joint point = method1, method2�� �ȴ�
	public void method1() {
		System.out.println("TestBean�� method1");
		int a = 100/0;
	}
	
	public void method2() {
		System.out.println("TestBean�� method2");
	}
	
	
}
