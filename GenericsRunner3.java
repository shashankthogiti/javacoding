package com.in28minutes.generics.method3;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner3 {
	
	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		
		String value = list.get(0);

		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));

		Integer number = list2.get(0);

		System.out.println(number);

	}

}
