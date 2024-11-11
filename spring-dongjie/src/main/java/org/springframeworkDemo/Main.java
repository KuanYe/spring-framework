package org.springframeworkDemo;

import org.springframeworkDemo.config.ConfigDemo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframeworkDemo.data.HelloData;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo1.class);
		HelloData bean = context.getBean(HelloData.class);
		bean.hello();
	}
}