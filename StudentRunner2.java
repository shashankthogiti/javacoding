public class StudentRunner2 {

	private String name;
	private int[] marks;

	public StudentRunner2(String name, int[] marks) {
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

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public static void main(String[] args) {
		int[] marks = {99,98,100};
		
		StudentRunner2 student = new StudentRunner2("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks:" + sum);


		int maximumMark = student.getMaximumMark();
		System.out.println("maxinum marks : " + maximumMark);

		int minimumMark = student.getMaximumMark();
		System.out.println("maxinum marks : " + minimumMark);
	}

}