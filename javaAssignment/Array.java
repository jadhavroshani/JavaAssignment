package javaAssignment;

import java.util.Scanner;

public class Array 
{
	public static void main(String[]agrs)
	{

		//Reading total no.of elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of number");
		int num = sc.nextInt();

		int[] myArray = new int[num];


		for(int i =0; i<num; i++){
			myArray[i] = sc.nextInt();
		}


		double average = 0;
		for(int i =0; i<num; i++){
			average = average + myArray[i];
		}

		average = average/num;
		System.out.println("Average of given numbers :: "+average);
	}
}





















