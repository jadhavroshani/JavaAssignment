package ExceptionHandling;

public class trycatch {


public static void main(String args[]){  
	   try
	   {  
	      //code that may raise exception  
	      int data=90/0;  
	   }
	   
	   catch(ArithmeticException e)
	   {
		   
		   System.out.println(e);
	   }  

	   
}
}  