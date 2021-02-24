package day_9.java.functions.com.code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
 
public class Odd_number
{
 
public static void main(String[] args) 
{
 
	Predicate<Integer> isOdd = n -> n % 2 != 0;
	 
	List.of(1, 2, 3, 4, 5,67,13,42,56,77,79,90).stream()
	   .filter(isOdd)
	   .forEach(System.out::println);
 
}
 
}


 
 

 
