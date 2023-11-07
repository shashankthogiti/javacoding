import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentMarks {

	private String name;
	private int[] marks;

	public StudentMarks(String name, int[] marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE; // min_value means lower value
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE; // max_value means higher value
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	public static void main(String[] args) {
		int[] marks = {99,98,100};
		
		StudentMarks student = new StudentMarks("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks:" + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maxinum marks : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("mainimum marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
	}

}   