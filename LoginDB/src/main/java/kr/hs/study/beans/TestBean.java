package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestBean {
	String userid;
	String userpass;
	String username;
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getUserid() {
		return userid;
	}
	
	public String getUsername() {
		return username;
	}
	public String getUserpass() {
		return userpass;
	}
	
}
