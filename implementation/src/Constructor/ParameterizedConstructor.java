package Constructor;
//Java Program to Illustrate Working of
//Parameterized Constructor

//Importing required inputoutput class

class ParameterizedConstructor1 {
	// data members of the class.
	String name;
	int id;

	// Constructor would initialize data members
	// With the values of passed arguments while
	// Object of that class created
	void ParameterizedConstructor(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

//Class 2

public class ParameterizedConstructor {
	private String name;
	private String id;

	public ParameterizedConstructor(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	// main driver method
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		ParameterizedConstructor ParameterizedConstructor1 = new ParameterizedConstructor("roshani", 1);
		System.out.println("ParameterizedConstructorName :" + ParameterizedConstructor1.name
						+ " and ParameterizedConstructorId :" + ParameterizedConstructor1.id);
	}
}
