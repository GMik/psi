/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hello;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.neweducation.data.config.PersistenceConfig;
import com.neweducation.data.persistence.entities.general.Kurs;

import core.model.CoursesModelImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)

public class GreetingControllerTests {

	// @Autowired
	// private MockMvc mockMvc;

	// @Test
	// public void noParamGreetingShouldReturnDefaultMessage() throws Exception
	// {
	//
	// this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
	// .andExpect(jsonPath("$.content").value("Hello, World!"));
	// }
	//
	// @Test
	// public void paramGreetingShouldReturnTailoredMessage() throws Exception {
	//
	// this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
	// .andDo(print()).andExpect(status().isOk())
	// .andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
	// }

	@Autowired
	ApplicationContext applicationContext;

	public void printBeans() {
		List<String> beans = Arrays.asList(applicationContext.getBeanDefinitionNames());
		for (String b : beans) {
			System.out.println(b);
		}
	}

	@Test
	public void testx() {
		printBeans();
		CoursesModelImpl model = new CoursesModelImpl();
		Kurs k = model.getById(1l);

		System.out.println(k.getLiczbaGodzin());
		System.out.println(k.getNazwa());
	}

}
