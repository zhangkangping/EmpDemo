package com.oasis.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {
	public static ApplicationContext ctx;
	static{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	}
}
