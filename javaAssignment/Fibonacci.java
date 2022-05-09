package javaAssignment;

import java.util.Scanner;

public class Fibonacci 
{
	//Fn = Fn-1 + Fn-2
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int f1= s.nextInt();
		int f2=s.nextInt();

		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) 
		{
			System.out.print(f1 + ", ");

			int temp = f1 + f2;
			f1=f2;
			f2 = temp;
		}
	}
}








