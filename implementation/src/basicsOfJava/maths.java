package basicsOfJava;

public class maths {
	 public static void main(String[] args) 
	 {
		 //Random Numbers   
		    int randomNum = (int)(Math.random() * 101);  // 0 to 100
		    System.out.println(randomNum);
		    System.out.println(Math.random()); 
		    
		//Math.abs(x)    
		    System.out.println("Math.abs(x) : " +Math.abs(-4.7));
		    
		    
		    System.out.println("Math.sqrt :" + Math.sqrt(64));
		    
		    System.out.println("Math.min :"+Math.min(5, 10)); 
		    
		    System.out.println("Math.max :" +Math.max(5, 10));
	}

}
