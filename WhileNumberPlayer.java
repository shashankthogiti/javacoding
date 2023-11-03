public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// For limit = 30 , output: 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	// For limit = 30 , output: 1 8 27
	public void printCubesUptoLimit() {
		int i = 1;
		while (i*i * i < limit) {
			System.out.print(i*i * i + " ");
			i++;
	}

}
	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(30); // number can be changed(the number should be an integer)

		player.printSquaresUptoLimit();

		player.printCubesUptoLimit();

	}

}