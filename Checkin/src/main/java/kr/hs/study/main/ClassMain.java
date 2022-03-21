package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Employee;
import kr.hs.study.beans.publisher;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Employee em1 = new Designer();
		Employee em2 = new Developer();
		Employee em3 = new publisher();
		
		method(em1);
		method1(em1);
	
		method(em2);
		method1(em2);
		
		method(em3);
		method1(em3);
	}
	
	public static void method(Employee cin) {
		cin.Checkin();
	}
	
	public static void method1(Employee cout) {
		cout.Checkout();
	}
}
