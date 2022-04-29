package kr.hs.study.dao;

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
	
	//1. insert
	public void insert_data(Testbean bean) {
		//container�� �ֈd TestBean�� ��ü�� bean�� �ڵ����Եȴ�. 
		String sql = "insert into test values(?,?)"; //int, String���� ��
		db.update(sql,bean.getData1(),bean.getData2());
	}
	

	
}