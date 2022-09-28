import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {


	multiplication obj = new multiplication();
     obj.mul1();
     obj.mul2();
// TODO Auto-generated method stub
}
	public void mul1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public void mul2() {
		System.out.println("The Multiplication Table from 1 to 10: \n");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
