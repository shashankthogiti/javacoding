package exceptionHandling;

class Amounttss {
	private String currency;
	private int amount;

	public Amounttss(String currency, int amount) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amounttss that) {
		if (!this.currency.equals(that.currency)) {
			// throw new Exception("Currencies Don't Match " + this.currency + " & " +
			// that.amount);
			throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.amount);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
	
}

public class ThrowingExceptionRunner5 {

public static void main(String[] args) throws CurrenciesDoNotMatchException {
	Amounttss amount1 = new Amounttss("USD", 10);
	Amounttss amount2 = new Amounttss("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
