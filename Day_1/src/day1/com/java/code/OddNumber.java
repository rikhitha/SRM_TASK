package day1.com.java.code;

public class OddNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr1= {11,33,11,13,15,17,19,27};
		int count=0;
		System.out.println("List of integers:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("**************");
		System.out.println("Check for odd numbers");
		System.out.println("**************");
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2==0)
			{
			count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("arr1 contains "+count+" even numbers");
		}
		else
		{
			System.out.println("arr1 conatains only odd numbers");
		}

	}

}
