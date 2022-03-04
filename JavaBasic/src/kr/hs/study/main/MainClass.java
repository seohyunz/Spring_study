package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKn;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		HelloWorld hello = new HelloWorldEn();
		HelloWorld hello2 = new HelloWorldKn();
		
		callMethod(hello);
		callMethod1(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
	
	public static void callMethod1(HelloWorld hello2) {
		hello2.sayHello();
	}
		
}
