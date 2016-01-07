package com.sample.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bean.TextEditor;

public class ConstructorDIUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		textEditor.spellCheck();

	}

}
