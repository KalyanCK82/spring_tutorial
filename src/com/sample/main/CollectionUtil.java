package com.sample.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.bean.JavaCollection;

public class CollectionUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		JavaCollection collection = (JavaCollection) context
				.getBean("collection");
		System.err.println("--------------------------------------");
		System.err.println("LIST");

		List addressList = collection.getAddressList();
		for (int index = 0; index < addressList.size(); index++) {
			System.err.println(addressList.get(index));
		}
		System.err.println("--------------------------------------");
		System.err.println("SET");

		Set addressSet = collection.getAddressSet();

		Iterator addrIterator = addressSet.iterator();

		while (addrIterator.hasNext()) {
			System.err.println(addrIterator.next());
		}
		System.err.println("--------------------------------------");
		System.err.println("MAP");
		Map addrMap = collection.getAddressMap();
		Set valueSet = addrMap.entrySet();

		Iterator iter = valueSet.iterator();

		while (iter.hasNext()) {
			System.err.println(iter.next());
		}

		System.err.println("--------------------------------------");
		System.err.println(collection.getAddressProps());

	}

}
