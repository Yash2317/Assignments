//WAP to accept character from the user and check it is vowel or not.
package fourth;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character");
		c=sc.next().charAt(0);
		z=Character.toUpperCase(c);
		//Checking the character which is inputed is vowel or not.
		switch(z) 
		{
		case 'A':
		case 'E':	
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c+" is a Vowel");
			break;
			
			default: System.out.println(c+" is a Non-Vowel Character");
			}
	}

}
