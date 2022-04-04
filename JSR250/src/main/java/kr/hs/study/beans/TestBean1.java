package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		// TODO Auto-generated constructor stub
		System.out.println("TestBean기본생성자");
	}
	
	public void initMehod() {
		System.out.println("생성자호출한 다음에 자동으로 실행되는 initmehod");
	}
	
	public void destoryMehod() {
		System.out.println("생성자소멸전에 자동으로 실행되는 destory method");
	}
}
