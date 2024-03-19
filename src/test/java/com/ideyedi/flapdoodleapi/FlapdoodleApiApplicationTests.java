package com.ideyedi.flapdoodleapi;

import com.ideyedi.flapdoodleapi.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class FlapdoodleApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void test() {
		User user = User.builder().name("test").email("test@email").build();
		mongoTemplate.save(user);
	}
}
