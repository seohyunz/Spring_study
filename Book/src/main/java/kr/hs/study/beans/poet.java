package kr.hs.study.beans;

public class poet implements Book{ //시
	private String data1;
	private String data2;
	private int data3;
	
	public void buy() {
		this.data1 = "kim";
		this.data2 = "spring1";
		this.data3 = 8000;
		System.out.println(" 산다");
		
	}

	public void sell() {
		this.data1 = "lee";
		this.data2 = "spring2";
		this.data3 = 10000;
		System.out.println(" 판다");
		
	}

	public void create() {
		this.data1 = "park";
		this.data2 = "spring3";
		this.data3 = 20000;
		System.out.println(" 만들다");
		
	}
	
	public void pr() {
		System.out.println(data1 +"의 소설" +data2 +"을"+ data3+"원");
	}

}
