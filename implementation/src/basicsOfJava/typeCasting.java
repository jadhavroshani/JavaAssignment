package basicsOfJava;

public class typeCasting 
{
	public static void main(String[]agrs)
	{
		System.out.println("Widening Casting :");
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);      // Outputs 9
		System.out.println(myDouble);   // Outputs 9.0

		System.out.println("Narrow Casting :");
		double myDouble1 = 9.78d;
		int myInt1 = (int) myDouble1; // Manual casting: double to int

		System.out.println(myDouble1);   // Outputs 9.78
		System.out.println(myInt1);      // Outputs 9
	}

}
