package com.sample.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bean.BaseClass;
import com.sample.bean.SubClass;

public class InheritanceUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		BaseClass baseObj = (BaseClass) context.getBean("base");
		System.err.println("--------------------------------------------");
		System.err.println("Super Class");
		System.err.println(baseObj.getMessage1());
		System.err.println(baseObj.getMessage2());
		System.err.println("--------------------------------------------");

		SubClass subClassObj = (SubClass) context.getBean("sub");
		System.err.println("--------------------------------------------");
		System.err.println("Sub Class");
		System.err.println(subClassObj.getMessage1());
		System.err.println(subClassObj.getMessage2());
		System.err.println(subClassObj.getMessage3());
		System.err.println("--------------------------------------------");

		context.registerShutdownHook();

	}

}
