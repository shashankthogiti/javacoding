package exceptionHandling;

class Amountts {
	private String currency;
	private int amount;

	public Amountts(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amountts that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("Currencies Don't Match " + this.currency + " & " +
			// that.amount);
			throw new CurrenciesDoNotMatchException();
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	
}

public class ThrowingExceptionRunner4 {

public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amountts amount1 = new Amountts("USD", 10);
		Amountts amount2 = new Amountts("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
