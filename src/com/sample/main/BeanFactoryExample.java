package com.sample.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sample.bean.Hello;

public class BeanFactoryExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"beans.xml"));
		Hello hello = (Hello) factory.getBean("hello");
		System.err.println(hello.getMessage());
	}

}
