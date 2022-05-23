package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Testbean;
//���� ������ �ۼ��ϴ� ��
@Component
public class TestDAO {
	//jdbcTemplate�� �ڵ�����
	@Autowired
	private JdbcTemplate db; 
	//���� ������ �����ִ� ��
	
	@Autowired
	MapperClass mapper;
	//container�� �ִ� MapperClass bean�� ã�Ƽ�  mapper�� �ڵ�����
	
	//1. insert
	public void insert_data(Testbean bean) {
		//container�� �ֈd TestBean�� ��ü�� bean�� �ڵ����Եȴ�. 
		String sql = "insert into test values(?,?)"; //int, String���� ��
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
