package ObjectOrientedProgrammingLanguage.java;

class Pens {
	String color;
	String type;

	public void write() {
		System.out.println("Writng Something");
	}

	public void printColors() {
		System.out.println(this.color);
	}
}


public class OOPS1 {

	public static void main(String[] args) {

		Pens pen1 = new Pens();
		pen1.color = "blue";
		pen1.type = "Gel";

		Pens pen2 = new Pens();
		pen2.color = "black";
		pen2.type = "ballPoint";

		pen1.printColors();
		pen2.printColors();
	}

}
