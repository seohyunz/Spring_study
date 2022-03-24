package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean2 {
	
	@Autowired // 
	private DataBean2 dat1;
	private DataBean2 data2;
	public DataBean2 getDat1() {
		return dat1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	
}
