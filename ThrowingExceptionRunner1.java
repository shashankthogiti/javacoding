package exceptionHandling;

class Amounts {
	private String currency;
	private int amount;

	public Amounts(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amounts that) {
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

public class ThrowingExceptionRunner1 {

	public static void main(String[] args) {
		Amounts amount1 = new Amounts("USD", 10);
		Amounts amount2 = new Amounts("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
