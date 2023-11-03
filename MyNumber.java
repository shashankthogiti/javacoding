public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		if (number < 2) { 		// we used this condition because the number should not be a negative number
			return false;
		}
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
				}
			}
		return true;
	}
	public static void main(String[] args) {
		
		
		MyNumber number = new MyNumber(4);		 // number can be 2,3,4,......out wish
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
	}

}