package kr.hs.study.beans;

public class DataBean1 {
	public DataBean1() {
		// TODO Auto-generated constructor stub
		System.out.println("DataBean1의 기본생성자");
	}
	
	public void init() {
		System.out.println("init메서드 호출");
	}
	
	public void destroy() {
		System.out.println("destroy메서드 호출");
	}
}
