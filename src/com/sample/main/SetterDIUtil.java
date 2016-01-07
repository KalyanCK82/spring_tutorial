package com.sample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bean.TxtEditor;

public class SetterDIUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		TxtEditor textEditor = (TxtEditor) context.getBean("txtEditor");
		textEditor.spellCheck();

	}

}
