package com.api.inscriptionsservice;

import com.api.inscriptionsservice.model.School;
import com.google.gson.Gson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InscriptionsServiceApplicationTests {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	@DisplayName("Testing the rest template")
	void restTemplateTest() {
		School school = restTemplate.getForObject("http://localhost:8090/school/1", School.class);

		assertThat(school).isNotNull();
		System.out.println(new Gson().toJson(school));
	}

}
