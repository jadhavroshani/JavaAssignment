package javaAssignment;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]agrs)
	{
		Scanner scan= new Scanner(System.in);

		int n = scan.nextInt(); // user input
		int m= n/2;                
		int flag =0;

		if(n==0 && n==1)
		{
			System.out.println("Not prime");

		}

		for(int i=2 ;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not prime");

				flag=1;    
				break;  
			}

		}
		if(flag==0)  
		  {
			 System.out.println(n+" is prime number");
		  }


	}

}
