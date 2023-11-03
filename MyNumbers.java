public class MyNumbers {

	private int number;

	public MyNumbers(int number) {
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

	public static void main(String[] args) {
		
		
		MyNumbers number = new MyNumbers(9); // number can be 2,3,4,......out wish

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sum " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);

	}

}