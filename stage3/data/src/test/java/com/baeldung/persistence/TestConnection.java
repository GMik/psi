package com.baeldung.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.neweducation.data.config.PersistenceConfig;
import com.neweducation.data.facade.DataFacade;
import com.neweducation.data.persistence.entities.general.Kurs;
import com.neweducation.data.services.KursService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)

public class TestConnection {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private KursService kursService;

	@Autowired
	private DataFacade dataFacade;

	private Session session;

	@Before
	public final void before() {
		session = sessionFactory.openSession();
	}

	@After
	public final void after() {
		// session.flush();
		// session.getTransaction().rollback();
		session.close();
	}

	@Test
	public final void whenEntityIsCreated_thenNoExceptions() {
		// kursService.find(1);

		// Kurs k = new Kurs();
		// k.setLiczbaGodzin(10);
		// k.setNazwa("nazwa");
		// k.setPowierzenia(null);
		// k.setPrzedmiot(null);
		// k.setZapotrzebowanie(null);
		//
		// kursService.create(k);

		Kurs k1 = dataFacade.find(1);
		System.out.println(k1.getLiczbaGodzin());
	}

	// @Autowired
	// @Qualifier("fooKursDao")
	// KursDao kursDao;
	//
	// @Autowired
	// ApplicationContext applicationContext;
	//
	// @Autowired
	// private SessionFactory sessionFactory;
	//
	// private Session session;
	//
	// @Before
	// public void setUp() throws Exception {
	// session = sessionFactory.openSession();
	// }
	//
	// @After
	// public void tearDown() throws Exception {
	// session.close();
	// }
	//
	// public void printBeans() {
	// List<String> beans =
	// Arrays.asList(applicationContext.getBeanDefinitionNames());
	// for (String b : beans) {
	// System.out.println(b);
	// }
	// }
	//
	// @Test
	// public void testConnection() {
	//
	// System.out.println("-----------------------------###############");
	// // printBeans();
	//
	// System.out.println(kursDao != null ? "KursDao is not null" : "KursDao is
	// null");
	//
	// Kurs k = kursDao.find(1);
	// System.out.println(k);
	//
	// }

}
