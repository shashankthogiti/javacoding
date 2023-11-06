public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;
	}
	public static void main(String[] args) {
		int[] marks = {99,98,100};
		
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		/*
		 * int sum = student.getTotalSumOfMarks(); int maximunMark =
		 * student.getMaximumMark(); int minimumMark = student.getMinimumMark();
		 * BigDecimal average = student.getAverageMarks();
		 */
	}

}