package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Lindkedlist {
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("ONE");  
		  al.add("TWO");  
		  al.add("THREE");  
		  al.add("FOUR");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}
