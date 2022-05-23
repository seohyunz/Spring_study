package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Testbean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao= ctx.getBean(TestDAO.class);
		/*
		 * //dao �������� 
		 * 
		 * //TestBean ��ü t1 ���� 10, Spring�ֱ� Testbean t1 = new Testbean();
		 * t1.setData1(100); t1.setData2("Spring1");
		 * 
		 * // dao�� inset_data ȣ�� dao.insert_data(t1);
		 * 
		 * Testbean t2 = new Testbean(); t2.setData1(200); t2.setData2("Spring2");
		 * 
		 * dao.insert_data(t2);
		 */
		/*
		 * dao.delete_data(10); System.out.println("Inserted");
		 * 
		 * List<>
		 */
		
		List<Testbean> list = dao.select_data();
		
		for(Testbean bean: list) {
			System.out.println("data1"+ bean.getData1());
			System.out.println("data2"+ bean.getData2());
		}
		
		
		ctx.close();
	}

}
