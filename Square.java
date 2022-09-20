/*  WAP to accept a number from user and display a square if number is divisible by 5*/

// importing Classes/Files
package firstpackage;

import java.util.*;

class Square {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num1,res;//initilize the variables
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:");
		num1=sc.nextInt();
		res = num1 * num1;
		
		if(num1 % 5 == 0)// Checking if remainder is 0 or not when divided by 5
		{
			System.out.println("The Square of the number is \n" + res);
		}
		else
		{
			// Print no if no is not divisible by 5
			System.out.println("no is not divisible by 5");
	}
	
}
}