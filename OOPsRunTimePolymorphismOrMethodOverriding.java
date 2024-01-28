package ObjectOrientedProgrammingLanguagePolymorphism.java;

class Animal {
	public void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog makes sound");
	}
}

public class OOPsRunTimePolymorphismOrMethodOverriding {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();

		Dog dog = new Dog();
		dog.makeSound();

	}

}
