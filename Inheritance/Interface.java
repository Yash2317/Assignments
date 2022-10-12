/*WAP to convert the currency using interface*/
package Multi;

public interface rupees {
	public void demo();
}

package Multi;

import java.util.Scanner;

public class Dollor implements rupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dollor obj = new Dollor();
		obj.demo();
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		double rup, dol;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Dollor:");
		dol = sc.nextDouble();
		rup = dol * 82.28;
		System.out.println("Converted value of Dollor into Rupees= " +rup+" Rs");

	}

}

package Multi;

import java.util.Scanner;

public class Pound implements rupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pound obj1 = new Pound();
		obj1.demo();
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		double rup, pod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Pound:");
		pod = sc.nextDouble();
		rup = pod * 90.95;
		System.out.println("Converted value of Pound into Rupees= " + rup + " Rs");
	}

}

package Multi;

import java.util.Scanner;

public class Euro implements rupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euro obj2 = new Euro();
		obj2.demo();
	}

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		double rup, er;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Euro:");
		er = sc.nextDouble();
		rup = er * 79.79;
		System.out.println("Converted value of Euro into Rupees= " + rup + " Rs");
	}

}
