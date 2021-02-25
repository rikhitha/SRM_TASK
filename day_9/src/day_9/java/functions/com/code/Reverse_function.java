package day_9.java.functions.com.code;

import java.util.ArrayList;
import java.util.Collections;



public class Reverse_function 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayli = new ArrayList<Integer>(); 
		  
        arrayli.add(new Integer(12)); 
        arrayli.add(new Integer(13)); 
        arrayli.add(new Integer(123)); 
        arrayli.add(new Integer(54)); 
        arrayli.add(new Integer(1)); 
        System.out.print("Elements before reversing: ");
        arrayli.forEach(element -> System.out.println(element));
        rev reverseobj=(ArrayList<Integer> arrayd)->{
        	Collections.reverse(arrayli);
        	System.out.println(arrayli);
        	
        };
        reverseobj.reverse(arrayli);
        
        
        
		

	}

}
