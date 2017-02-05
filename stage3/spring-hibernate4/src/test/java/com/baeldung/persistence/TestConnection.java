package com.baeldung.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.neweducation.data.config.PersistenceConfig;
import com.neweducation.data.persistence.daos.KursDao;
import com.neweducation.data.persistence.entities.general.Kurs;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class TestConnection {

	@Autowired
	@Qualifier("kursDao")
	KursDao kursDao;

	@Test
	public void testConnection() {

		Kurs k = kursDao.find(1);

	}

}
