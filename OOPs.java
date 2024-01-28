package ObjectOrientedProgrammingLanguagePolymorphism.java;

//polymorphism means one with many forms.The polymorphism is of two types
//1.Compile-time ploymorphism(Method-overloading)
//2.Run-time polymorphism(Method-overriding)

class Father {
	public void eat() {
		System.out.println("father is eating");
	}
}

class Person extends Father {
	public void eats() {
		System.out.println("Person is eating");
	}
}

public class OOPs {

	public static void main(String[] args) {

		Person person = new Person();
		person.eat();
		person.eats();

	}

}
