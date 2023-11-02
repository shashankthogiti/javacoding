public class Book {
	private int noOfCopies;
	// void textBooks() {
	// System.out.println("The books are Art of Computer Programming , Effective
	// Java , Clean code");

	Book(int speed) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}


	public void setNoOfCopies(int noOfCopies)
	{
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
		public static void main(String[] args) {
		
		Book artofComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleancode = new Book(40);
		
		System.out.println(artofComputerProgramming.getNoOfCopies());
		
		artofComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(50);
		cleancode.setNoOfCopies(45);
		
		// artofComputerProgramming.Book();
		// effectiveJava.Book();
		// cleancode.Book();

	}

}