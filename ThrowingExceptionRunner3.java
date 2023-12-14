package exceptionHandling;

class Amountsss {
	private String currency;
	private int amount;

	public Amountsss(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amountsss that) throws Exception {
		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies Don't Match " + this.currency + " & " + that.amount);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingExceptionRunner3 {

	public static void main(String[] args) throws Exception {
		Amountsss amount1 = new Amountsss("USD", 10);
		Amountsss amount2 = new Amountsss("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
