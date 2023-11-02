import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1");
		int n1 = sc.nextInt();
		System.out.println("The number you entered is : " + n1);

		System.out.println("Enter Number2");
		int n2 = sc.nextInt();
		System.out.println("The number you entered is : " + n2);

		System.out.println("Choices Available are:");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();

		System.out.println("Your choices are");
		System.out.println("Number1\t" + n1);
		System.out.println("Number2\t" + n2);
		System.out.println("choice\t" + choice);
		
		switch (choice) {
		case 1:
			System.out.println("Result is: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Result is: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Result is: " + (n1 / n2));
			break;
		case 4:
			System.out.println("Result is: " + (n1 * n2));
			break;
		default:
			System.out.println("Invalid Number or choice");
			break;
		}
		
	}

}
