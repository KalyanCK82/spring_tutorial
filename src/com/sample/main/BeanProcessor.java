package com.sample.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("In postProcessAfterInitialization");
		return obj;
	}

	public Object postProcessBeforeInitialization(Object obj, String bean)
			throws BeansException {
		System.out.println("In postProcessBeforeInitialization");
		return obj;
	}

}
