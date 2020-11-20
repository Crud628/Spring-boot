package com.example.demo.entity;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person")
@Component
public class Person {
	
	
	private String name;
	private int age;
	private String sex;
	private List<String> likes;
	
	public Person() {

	}
	
	public Person(String name, int age, String sex, List<String> likes) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.likes = likes;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getLikes() {
		return likes;
	}
	public void setLikes(List<String> likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", likes=" + likes + "]";
	}
	
	
}
