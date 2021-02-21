package day1.com.java.code;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="java full stack development";
		char ch[]=string1.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		

	}

}
