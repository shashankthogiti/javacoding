package api.d;

public class StringNewApiRunnerForJava11Java12Java13Java14 {

	public static void main(String[] args) {
		System.out.println("".isBlank());// isBlank() method is used to check weather it contains non white space
											// characters
		System.out.println("Hello".isBlank());

		System.out.println(" LR ".strip());// which remove spaces

		System.out.println(" LR ".stripLeading());// which remove spaces on left side

		System.out.println(" LR ".stripTrailing());// which remove spcae on right side
		
		// System.out.println("\n\n Same as above method for our understand
		// we replace space with @ \n\n");

		System.out.println(" LR ".strip().replace(" ", "@"));// which remove spaces

		System.out.println(" LR ".stripLeading().replace(" ", "@"));// which remove spaces gor left side

		System.out.println(" LR ".stripTrailing().replace(" ", "@"));// which remove spcae on right side

		// System.out.println("\n\n Printing lines in new lines \n\n");
		
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);// .lines() method toprint in next line

		System.out.println("UPPER".transform(s -> s.substring(2)));// This feature introdeced in jdk 12 And
																	// .transform() used in .substring() method is used
																	// to remove the stating alphabets
		System.out.println("My name is %s. My age is %d".formatted("Shashank", 22)); // This feature is introduced in
																						// jdk 13 And .formatted()is
																						// usto input the String,
																						// Integer

		// This method is introduced in jdk14 and it gives a NUllPointerException
		String str = null;
		System.out.println(str.isBlank());
		/*
		 * output:-
		 * 
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
		 * "String.isBlank()" because "str" is null at
		 * api.d.StringNewApiRunnerForJava11Java12Java13Java14.main(
		 * StringNewApiRunnerForJava11Java12Java13Java14.java:39)
		 * 
		 */

	}

}
