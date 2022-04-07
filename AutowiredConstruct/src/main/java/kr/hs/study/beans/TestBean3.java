package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean3 {
	private DataBean3 data3;
	private DataBean4 data4;
	
	private int  data1;
	private String data2;
	
	public TestBean3(@Value("200")int data1, @Value("spring222") String data2, DataBean3 data3, DataBean4 data4) {
		// TODO Auto-generated constructor stub
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	//오토와이어드는 자동으로 setter을 만들어주기 때문에 get만 만들었다
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean3 getData3() {
		return data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
	
}
