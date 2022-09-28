import java.util.Scanner;

public class patterns {
	public static void main(String[] args) {

		patterns obj = new patterns();
		obj.pat1();
		obj.pat2();
		obj.pat3();
		obj.pat4();
	}

	public void pat1() {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size:");
		size = sc.nextInt();
		for (i = 1; i <= size; i++) {
			for (j = i; j <= size; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void pat2() {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size:");
		size = sc.nextInt();
		for (i = 1; i <= size; i++) {
			for (j = i; j <= size; j++) {
				System.out.print(" ");
			}
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pat3() {
		Scanner sc=new Scanner(System.in);
		int size,i,j;
		char ch;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1,ch=65;j<=i;j++,ch++)
			{
				System.out.print(ch);
				
			}
			System.out.println();
		}
	}

	public void pat4() {
		int size,i, j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for( k=i;k<=size;k++)
			{
				if(k%2==0)
				{
					System.out.print("0");
				}
				else
				{
				System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
}
