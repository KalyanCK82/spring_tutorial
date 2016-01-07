package com.sample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sample.bean.Hello;

public class FileApplicationCxtUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\beans.xml");
		Hello helloBean = (Hello) context.getBean("hello");
		helloBean.getMessage();
	}

}
