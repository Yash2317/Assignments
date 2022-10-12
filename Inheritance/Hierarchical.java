/*WAP to accept from the user and perform the different types of operater. */
package Inherti_demo;

import java.util.Scanner;

public class Accept_val {

	static int num1, num2, num3;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		
	}
}

package Inherti_demo;

public class Arithmatic extends Accept_val {

	public void arithmatic() {
		System.out.println("Arithmatic Operations for two numbers:\n");
		System.out.println("Addition = " + (num1 + num2));
		System.out.println("Substraction = " + (num1 - num2));
		System.out.println("Multiplication = " + (num1 * num2));
		System.out.println("Division = " + (num1 / num2));
		System.out.println("Modulus = " + (num1 % num2));
		System.out.println("");
	}
}

package Inherti_demo;

public class Logical extends Accept_val {

	public static void logi() {

		System.out.println("The logical operations for three number:\n");

		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + " is greater number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greater number");
		} else {
			System.out.println(num3 + " is greater number");
		}
		{
			System.out.println("");
			if (num1 > num2 || num1 > num3 || num2 > num1 || num3 > num2) {
				System.out.println("if condition is true add a b and c = " + (num1 + num2 + num3));
			}

			System.out.println("NOT Operator(!)"); // ! operator
			System.out.println(!(num1 == num2));
			System.out.println(!(num1 > num2));
			System.out.println(!(num1 < num2));
			System.out.println("");
		}
	}
}

package Inherti_demo;

public class Ternery extends Accept_val {
	public static void ternary() {
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("Ternery Operation for the given numbers:\n	");
		// Print the largest number
		System.out.println("Maximum is = " + max);
		System.out.println("");
	}
}

package Inherti_demo;

public class Bitwise extends Accept_val {

	public static void bitwise() {
		System.out.println("Bitwise operation for the given numbers\n");
		System.out.println("number1 & number2 = " + (num1 & num2)); //// bitwise and
		System.out.println("number1 ^ number2 = " + (num1 ^ num2)); //// bitwise XOR
		System.out.println("number1 | number2 = " + (num1 | num2)); // bitwise inclusive OR
		System.out.println("~number1 = " + (~num1)); // bitwise compliment
		System.out.println("");
	}

}

package Inherti_demo;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmatic a = new Arithmatic();
		a.accept();
		a.arithmatic();

		Logical l = new Logical();
		l.logi();
		Ternery t = new Ternery();
		t.ternary();
		Bitwise b = new Bitwise();
		b.bitwise();
	}

}
