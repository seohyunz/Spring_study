package kr.hs.study.beans;

public class Person {
	private String name;
	private String play;
	private int age;

	 public Person() {
		// TODO Auto-generated constructor stub
	}
	 
	public void eat() {
		System.out.println("ธิดู");
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public String getPlay() {
		return play;
	}
	
}
