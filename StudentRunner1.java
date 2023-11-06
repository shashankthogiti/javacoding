public class StudentRunner1 {

	private String name;
	private int[] marks;

	public StudentRunner1(String name, int[] marks) {
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
		int maximum = 0;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}
	public static void main(String[] args) {
		int[] marks = {99,98,100};
		
		StudentRunner1 student = new StudentRunner1("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks:" + sum);


		int maximumMark = student.getMaximumMark();
		System.out.println("maxinum marks : " + maximumMark);
	}

}