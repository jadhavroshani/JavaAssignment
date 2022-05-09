package javaAssignment;

import java.util.Scanner;

public class Palindrome {


	public static void main(String args[])
	{	 


		Scanner s = new Scanner(System.in);
		int r=0;
		int sum=0;
		int temp=0;    
		int n=s.nextInt();//It is the number variable to be checked for palindrome  

		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number ");    
		else    
			System.out.println("not palindrome");    
	}  
}  