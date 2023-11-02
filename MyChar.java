public class MyChar {

	private char ch;

	public MyChar(char c) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'o' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u'  || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {

		// jshell> (int)'0' $56 ==> 47 ; jshell> (int)'9' $58 ==> 57
		// i want to find ch > 48 && ch <57
		if (ch > 48 && ch < 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) { // between a to z
			return true;
		}
		else if (ch >= 65 && ch <= 90) { // between A to Z
			return true;
		}
		else {
			return false;	
		}
	}

	public boolean isConsonent() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for(char ch = 'a' ; ch <= 'z' ; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.println(ch);
	}
}
	public static void main(String args[]) {
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel()); // 'a','e','i','o','u' and Capitals
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonent());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}
}