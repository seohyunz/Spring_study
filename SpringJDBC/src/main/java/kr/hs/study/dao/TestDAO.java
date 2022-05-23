package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Testbean;
//실제 쿼리를 작성하는 곳
@Component
public class TestDAO {
	//jdbcTemplate을 자동주입
	@Autowired
	private JdbcTemplate db; 
	//실제 쿼릴를 날려주는 앤
	
	@Autowired
	MapperClass mapper;
	//container에 있는 MapperClass bean을 찾아서  mapper에 자동주입
	
	//1. insert
	public void insert_data(Testbean bean) {
		//container에 있늕 TestBean의 객체가 bean에 자동주입된다. 
		String sql = "insert into test values(?,?)"; //int, String값이 들어감
		db.update(sql,bean.getData1(),bean.getData2());
	}
	
	//update
	public void update_data(Testbean bean) {
		String sql="update test set data2=? where data1=?";
		db.update(sql,bean.getData1(),bean.getData2());
	}
	
	//delete
	public void delete_data(int data1 ) {
		String sql="delete test set data2=? where data1=?";
		db.update(sql);
	}
	
	//select
	public List<Testbean> select_data(){
		String sql="select * from TestBean";
		List<Testbean> list = db.query(sql,  mapper);
		return list;
	}
	
}
