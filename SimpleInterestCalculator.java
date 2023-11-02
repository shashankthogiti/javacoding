import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principal;

	BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculatorTotalValue(int noOfYears) {
		// TotalValue = principal + principal * interest * noOfYears
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculatorTotalValue(5); // 5 years
		System.out.println(totalValue);

	}
}
