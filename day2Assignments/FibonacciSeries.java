package week1.day2Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0,b=1;
		
		System.out.println("Fibonacci Series upto "+ n );
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a + ",");
			int Term = a+b;
			a=b;
			b=Term;
		}

	}

}
