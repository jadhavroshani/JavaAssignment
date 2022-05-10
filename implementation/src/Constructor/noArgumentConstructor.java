package Constructor;

public class noArgumentConstructor {


//Java Program to illustrate calling a
//no-argument constructor


	int num;
	String name;

	// this would be invoked while an object
	// of that class is created.
	noArgumentConstructor() { System.out.println("Constructor called"); }
}

class noAconstructor{
	public static void main(String[] args)
	{
		// this would invoke default constructor.
		noArgumentConstructor noArgumentConstructor1 = new noArgumentConstructor();

		// Default constructor provides the default
		// values to the object like 0, null
		System.out.println(noArgumentConstructor1.name);
		System.out.println(noArgumentConstructor1.num);
	}
}
