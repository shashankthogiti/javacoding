package ObjectOrientedProgrammingLanguagePolymorphism.java;

class Add1 {
	public void Add1(int a, int b) {// not a contsractor
		System.out.println("Addition is: " + (a + b));
	}
}

class Adds1 {
	public void Adds1(double a, double b) {// not a constractor
		System.out.println("Addition is: " + (a + b));
	}
}

public class OOPsCompileTimePolymorphismOrMethodOverloading2 {

	public static void main(String[] args) {

		Add1 add = new Add1();
		add.Add1(2, 5);

		Adds1 adds = new Adds1();
		adds.Adds1(2, 5);

	}

}
