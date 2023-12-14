package eclipse.imports.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		// exampleClass.privateMethod();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
		exampleClass.publicMethod();
	}

}

/*
 * public:-
 * 
 * It can be accessed in any package or different package
 * 
 * protected:-
 * 
 * It can be accessed in same package or sub class
 * 
 * private:-
 * 
 * It can only available in inside specific class there is no access out side
 * the class
 * 
 * default:-
 * 
 * It is accessed in same class and same package
 * 
 */
