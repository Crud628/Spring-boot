package com.example.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
	
	String name() default "张三";
}

class Test{
	@MyAnnotation(name = "李四")
	private String name;
	@MyAnnotation
	public void haha() {
		
	}
}
