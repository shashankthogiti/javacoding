package api.d;

public class StringNewApiRunnerCopie {

	// .isBlank() .strip() .stripLeading() .stripTrailing() .lines() method
	// introduced
	// in java 11

	public static void main(String[] args) {
		System.out.println(" ".isBlank());// isBlank() method is used to check weather it contains non white space
											// characters
		System.out.println("Hello".isBlank());

		System.out.println(" LR ".strip());// which remove spaces

		System.out.println(" LR ".stripLeading());// which remove spaces gor left side

		System.out.println(" LR ".stripTrailing());// which remove spcae on right side
		
		// System.out.println("\n\n Same as above method for our understand
		// we replace space with @ \n\n");

		System.out.println(" LR ".strip().replace(" ", "@"));// which remove spaces

		System.out.println(" LR ".stripLeading().replace(" ", "@"));// which remove spaces gor left side

		System.out.println(" LR ".stripTrailing().replace(" ", "@"));// which remove spcae on right side

		// System.out.println("\n\n Printing lines in new lines \n\n");
		
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);// .lines() method toprint in next line

	}

}
