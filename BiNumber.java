public class BiNumber {

	private int number1;
	private int number2;


	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add() {
		int sum = number1 + number2;
		return sum;
	}

	public int multiply() {
		int mul = number1 * number2;
		return mul;
	}

	public void doubleValue() {
		this.number1 *= 2;
		this.number2 *= 2;
	}
	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

	}

}