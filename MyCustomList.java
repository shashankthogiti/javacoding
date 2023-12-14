package com.in28minutes.generics.wildcards.method;

import java.util.ArrayList;

public class MyCustomList<T> { // here we have both String and Integer so we use generic method to short
												// the
								// code i.e., we replace it with 'T' // T indicates type

	ArrayList<T> list = new ArrayList<>(); // replacing Integer or String with T
	
	public void addElement(T element) { // replacing Integer or/and String with T
		list.add(element);
	}
	
	public void removeElement(T element) { // replacing Integer or/and String with T
		list.remove(element);
	}

	@Override
	public String toString() { // we can not replaceString with T in this line
		return list.toString();
	}

	public T get(int index) { // replacing Integer and String with T
		return list.get(index);
	}
}
