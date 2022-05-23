package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.DataClassRowMapper;
import kr.hs.study.beans.Testbean;

public class MapperClass extends DataClassRowMapper<Testbean>{
	public Testbean mapRow(ResultSet rs, int rowNum) throws SQLException{
		Testbean bean = new Testbean();
		bean.setData1(rs.getInt("data1"));
		bean.setData2(rs.getString("data2"));
		
		return bean;
		
	}
	
	

}
