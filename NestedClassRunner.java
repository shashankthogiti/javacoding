package eclipse.imports.tips.nestedclass;

class Defaultclass {
	
}

public class NestedClassRunner {

	int i;

	class Innerclass {
		public void method() {
			i = 5;
		}

	}

	static class StaticNestedClass {
		public void method() {
//			i=5;	// getting an error
		}

	}

	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass();

		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		Innerclass innerClass = nestedClassRunner.new Innerclass();
	}

}
