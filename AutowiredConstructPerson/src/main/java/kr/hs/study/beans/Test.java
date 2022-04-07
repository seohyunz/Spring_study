package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Test {
	@Autowired
	@Qualifier("d1");
	private Person p1;
	@Autowired
	@Qualifier("d2");
	private Person p2;
	
	
	
	
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
	
	public void pr() {
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
	}
}
