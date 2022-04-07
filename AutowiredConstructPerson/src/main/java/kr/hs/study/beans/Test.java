package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class Test implements Person{
	private Person p1;
	private Person p2;
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ธิดู");
	}
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(Person p1,Person p2) {
		// TODO Auto-generated constructor stub
		this.p1 = p1;
		this.p2 =p2;
	}
	
	
	public Person getP1() {
		return p1;
	}
	
	public Person getP2() {
		return p2;
	}
	
}
