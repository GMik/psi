package com.baeldung.persistence;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import com.neweducation.data.config.PersistenceConfig;
import com.neweducation.data.persistence.daos.KursDao;
import com.neweducation.data.persistence.entities.general.Kurs;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)
@Transactional(value = "jpaTransactionManager")
public class TestConnection {

	@Autowired
	@Qualifier("fooKursDao")
	KursDao kursDao;

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	@Before
	public void setUp() throws Exception {
		session = sessionFactory.openSession();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

	public void printBeans() {
		List<String> beans = Arrays.asList(applicationContext.getBeanDefinitionNames());
		for (String b : beans) {
			System.out.println(b);
		}
	}

	@Test
	public void testConnection() {

		System.out.println("-----------------------------###############");
		// printBeans();

		System.out.println(kursDao != null ? "KursDao is not null" : "KursDao is null");

		Kurs k = kursDao.find(1);
		System.out.println(k);

	}

}
