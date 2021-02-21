package day1.com.java.code;

public class Whitespace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String string1="   Full    Stack   Development  ";
		string1=string1.replaceAll("\\s","");
		System.out.println(string1);

	}

}
