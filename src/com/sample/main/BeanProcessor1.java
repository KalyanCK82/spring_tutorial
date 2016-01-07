package com.sample.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessor1 implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("In postProcessAfterInitialization 1");
		return obj;
	}

	public Object postProcessBeforeInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("In postProcessBeforeInitialization 1");
		return obj;
	}

}
