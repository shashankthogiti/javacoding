package com.in28minutes.generics.wildcards.method;

class Test<T> { // generic method
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}
}

public class TestRunnerGenericsExampleDemo {

	public static void main(String[] args) {
		Test<Integer> objectInteger = new Test<>(15);
		System.out.println(objectInteger.getObject());

		Test<String> objectString = new Test<>("Shashank");
		System.out.println(objectString.getObject());
	}

}
