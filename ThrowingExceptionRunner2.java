package exceptionHandling;

class Amountss {
	private String currency;
	private int amount;

	public Amountss(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amountss that) {
		if (!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies Don't Match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingExceptionRunner2 {

	public static void main(String[] args) {
		Amountss amount1 = new Amountss("USD", 10);
		Amountss amount2 = new Amountss("USD", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
