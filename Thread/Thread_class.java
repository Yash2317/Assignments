/*WAP for thread using Thread class and display the Fibonacci series */
package thread1;

public class Fibo extends Thread{
	public static void main(String[] args) {
	Fibo ob=new Fibo();
	ob.start();
	Fibo ob1=new Fibo();
	ob1.start();
	}
	public void run() {
		int n = 50, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}
}
