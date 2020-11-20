package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Person;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	Person person;
	
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
