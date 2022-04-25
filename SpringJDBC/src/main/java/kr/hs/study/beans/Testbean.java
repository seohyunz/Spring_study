package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//하는일 -> db테이블에 들어갈 값을 저장하거나,
//db테이블에서 가져온느 값을 저장하는 곳
//(dto)
@Component
@Scope("prototype")
public class Testbean {
	private int data1;
	private String data2;
	
	public int getData1() {
		return data1;
	}
	
	public String getData2() {
		return data2;
	}
	
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public void setData2(String data2s) {
		this.data2 = data2;
	}
	
}
