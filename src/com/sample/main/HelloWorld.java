package com.sample.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bean.Hello;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		Hello helloBean = (Hello) context.getBean("hello");
		System.err.println("--------------------------------------------");
		System.err.println(helloBean.hashCode());
		System.err.println(helloBean.getMessage());
		System.err.println("--------------------------------------------");

		Hello hello = (Hello) context.getBean("hello");
		System.err.println(hello.hashCode());
		System.err.println(hello.getMessage());
		System.err.println("--------------------------------------------");

		context.registerShutdownHook();

	}

}
