public class MyNumberRunner {

	private int number;

	public MyNumberRunner(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2) { // we used this condition because the number should not be a negative number
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
				}
			}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		
		MyNumberRunner number = new MyNumberRunner(5); // number can be 2,3,4,......out wish

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sum " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);

		number.printNumberTriangle();

	}

}