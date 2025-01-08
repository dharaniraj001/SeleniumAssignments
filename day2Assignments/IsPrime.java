package week1.day2Assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=68;
		if(a<2) 
		{
			System.out.println("not prime");
		}
		else 
		{
		boolean prime=true;
		for(int i=2;i<a;i++)
			{
			if(a%i==0) 
				{
				prime=false;
				break;
				}
			}
		if(prime==false) 
		{
			System.out.println("not prime");
		}
		else 
		{
			System.out.println("prime");
		}
			}

		
			} 
		

	}

