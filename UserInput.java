package multipleOf3or5;
/*
 * S.Priyadharshini
 * 10.1.2018
 * 
 */

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter value of n:  ");
		int n = sc.nextInt();
		boolean result = MultipleOf3Or5.multipleOf3Or5Only(n);
		System.out.println("n is divisible by 3 or 5 but not both:" + result);
	}
}
