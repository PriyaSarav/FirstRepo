package multipleOf3or5;
/*
 * S.Priyadharshini
 * 10.1.2018
 * 
 */

public class MultipleOf3Or5 {
	public static boolean multipleOf3Or5Only(int n) {
		if (n % 3 == 0 ^ n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		int n;
		boolean result;
		// test:1
		n = 25;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);
		// test:2
		n = 19;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);
		// test:3
		n = 5;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);

		// test:4
		n = 3;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);

		// test:5
		n = 35;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);
		// test:6
		n = 30;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);
		// test:7
		n = 15;
		result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println(result);
	}
}
