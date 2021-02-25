package day_9.java.functions.com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Hashmaps {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> ranks = new HashMap<String, Integer>();
	      ranks.put("India", 1);
	      ranks.put("Australia", 2);
	      ranks.put("England", 3);
	      ranks.put("Newzealand", 4);
	      ranks.put("South Africa", 5);
	      System.out.println("Unsorted HashMap ");
	      
	      ranks.forEach((k,v) -> System.out.println("Team : " + k + ", Rank : " + v));
	     
	      
	      hashinterface hashob=(HashMap<String, Integer> hashmapss)->{
	    	  System.out.println("Sorting HashMap by Keys");
	    	  TreeMap<String, Integer> sorted = new TreeMap<>(); 
	          sorted.putAll(ranks); 
	          for (Map.Entry<String, Integer> entry : sorted.entrySet())
	        	 
	              System.out.println("Key = " + entry.getKey() +  
	                           ", Value = " + entry.getValue());
	          
	          System.out.println("Sorting HashMap by Values");
	    	  TreeMap<String, Integer> valuesort = new TreeMap<>(); 
	          sorted.putAll(ranks); 
	          for (Map.Entry<String, Integer> entry : valuesort.entrySet())
	        	 
	              System.out.println("Key = " + entry.getKey() +  
	                           ", Value = " + entry.getValue());
	      };
	      hashob.hash(ranks);
	      
	      
	      
	      
	      

	}

}
