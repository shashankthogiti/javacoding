package ObjectOrientedProgrammingLanguagePolymorphism.java;

class Add {
	Add(int a, int b) {
		System.out.println("Addition is: " + (a + b));
	}
}

class Adds {
	Adds(double a, double b) {
		System.out.println("Addition is: " + (a + b));
	}
}

public class OOPsCompileTimePolymorphismOrMethodOverloading1 {

	public static void main(String[] args) {

		Add add = new Add(2, 5);
		Adds adds = new Adds(2, 5);

	}

}
