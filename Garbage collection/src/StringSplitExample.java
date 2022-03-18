
public class StringSplitExample {

	public static void main(String[] args) {

		String today = "26-10-2021";
		// 0 1 2
		String[] strings = today.split("-");// strings ["26"]["10"]["2021"]

		for (String string : strings) {
			System.out.println(string);
		}

		for (int index = strings.length - 1; index >= 0; index--) {
			System.out.print(strings[index] + " ");
		}

	}
}

class A extends Object {
	int a = 10;

	// toString() should be overridden in every java class to return
	// state of an object ( data of an object / contents of an object )

	public String toString() {
		return "A [a=" + a + "]";
	}

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj);
	}
}

class PrintWordsInReverseOrder {
	public static void main(String[] args) {

		String today = "java by kiran pune";
		// 0 1 2 3
		String[] strings = today.split(" ");// strings
											// ["java"]["by"]["kiran"]["pune"]

		for (int index = strings.length - 1; index >= 0; index--) {
			System.out.print(strings[index] + " ");
		}

	}
}
