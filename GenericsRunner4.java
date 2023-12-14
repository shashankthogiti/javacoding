package com.in28minutes.generics.wildcards.method;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner4 {
	
	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) { // wildcard method syntax - it is upper bounded
																	// wildcard
		double sum = 0.0;
		for(Number number: numbers) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}

	static void addACoupleOfValues(List<? super Number> numbers) { // wildcard method syntax - it is lower bounded
																	// wildcard
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
		}

	public static void main(String[] args) {
		
		System.out.println("OUTPUT for lower bounded wildcard method");
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

		System.out.println("OUTPUT for upper bounded wildcard method");
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));
		
		System.out.println("puzzle of Generic method");
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
		
		System.out.println("normal generic method");
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
