/*Write a program to create  two classes  1st class do the process of fibonacci series
and in second class find out the greater between two no. from second class display both the operation.
*/
package Inherti_demo;

import java.util.Scanner;

public class Fibo {
	static Scanner sc = new Scanner(System.in);

	public static void fibo() {
		int num1 = 0, num2 = 1, num3, i, count;
		System.out.println("Enter the required number for list : ");

		count = sc.nextInt();
		System.out.print(num1 + " " + num2);
		for (i = 2; i < count; ++i) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
package Inherti_demo;

public class Grt_of_two extends Fibo {

	public static void greater() {
		int num1, num2;
		System.out.println("Enter the two numbers ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " is greter than " + num2);
		} else {
			System.out.println(num2 + " is greter than " + num1);
		}
	}

	public static void main(String[] args) {
		greater();
		fibo();

	}

}
