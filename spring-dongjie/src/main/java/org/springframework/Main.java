package org.springframework;

import org.springframework.config.ConfigDemo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.HelloData;

/**
 * Classname org.springframework.${NAME}.java
 * @author dongjie
 * @Date 2024/11/11 11:14
 * @version 1.0
 * Copyright notice
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo1.class);
		HelloData bean = context.getBean(HelloData.class);
		bean.hello();
	}
}