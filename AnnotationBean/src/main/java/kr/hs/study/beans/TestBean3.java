package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean3 {
	private int data1;
	private String data2;
	
	private DataBean3 data3;
	private DataBean4 data4;
	public TestBean3() {
		// TODO Auto-generated constructor stub
	}
	//�ڵ����� ���ԵǱ� ������ @Autowired ���ص� ����
	public TestBean3(DataBean3 data3, DataBean4 data4) {
		// TODO Auto-generated constructor stub
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
	public TestBean3(@Value("100") int data,@Value("spring1111") String data2,DataBean3 data3, DataBean4 data4) {
		// TODO Auto-generated constructor stub
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public DataBean3 getData3() {
		return data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
}
