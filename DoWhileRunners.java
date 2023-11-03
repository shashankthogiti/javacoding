import java.util.Scanner;

public class DoWhileRunners {
	public static void main(String[] args) {
		int i = -1;
		Scanner sc = new Scanner(System.in);

		do {
			if (i != -1) {
				System.out.println("Cube is:  " + (i * i * i));
			}
			System.out.println("Enter a number: ");
			i = sc.nextInt();
		} while (i >= 0);
		System.out.println("Thank You! Have Fun");
	}

}