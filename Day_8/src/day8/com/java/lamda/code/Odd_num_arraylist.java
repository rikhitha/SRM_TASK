package day8.com.java.lamda.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Odd_num_arraylist {

	public static void main(String[] args) 
	{
		List<Integer> values=  Arrays.asList(23,54,64,23,12,35,23,16,78,55,53,73,79,77,23);
		List<Integer> oddnum=values.stream().filter(g->g%2!=0).collect(Collectors.toList());
		System.out.println(oddnum);
		

	}

}
