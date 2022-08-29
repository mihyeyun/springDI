package com.spring.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {

	@Autowired
	private DataSource ds;	//주입했으므로 객체임
	
	@Test
	public void testConnection() {
		//try ~ catch (-> try~with~resource)
		try(Connection con = ds.getConnection()){
			log.info(con); 	//연결 객체 로그 출력
		}catch(Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
	}
}
