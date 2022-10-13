//WAP to calculate the rate of interest of different bank by using Multiple inheritance.

package Multi;

public interface SBI {
	double sbi = 5.4;

	public void sbi();
}
package Multi;

public interface Axis {
	double axis = 3.5;

	public void axis();
}
package Multi;

public interface Union {
	double union = 5.5;

	public void union();

}
package Multi;

import java.util.Scanner;

public class Bank implements SBI, Axis, Union {
	Scanner sc = new Scanner(System.in);
	int pri = sc.nextInt();
	int time = sc.nextInt();

	public static void main(String[] args) {

		System.out.println("Enter the Amount and Year:");
		Bank obj=new Bank();
		obj.union();
		obj.axis();
		obj.sbi();  
	}

	@Override
	public void union() {
		// TODO Auto-generated method stub
		double u = pri * time * union / 100;
		System.out.println("The Interest of Union bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+union+"% is "+u+"Rs\n\n");
	}

	@Override
	public void axis() {
		// TODO Auto-generated method stub
		double a = pri * time * axis / 100;
		System.out.println("The Interest of Axis bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+axis+"% is "+a+"Rs\n\n");
	}

	@Override
	public void sbi() {
		// TODO Auto-generated method stub
		double s = pri * time * sbi / 100;
		System.out.println("The Interest of SBI bank for the Principle Amount "+pri+" \nRs for time duration of "+time+" years with the \nrate of interest of "+sbi+"% is "+s+"Rs");
	}

}
 
