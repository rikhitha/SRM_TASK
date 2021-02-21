package day3.com.collections.java.code;
class array
{
	int[] array1;

	array(int[] array1)
	{
		this.array1=array1;
	}
	public void print_array()
	{
		System.out.println("Array");
		for(int i=0;i<array1.length;i++)
		{
			
			System.out.println(array1[i]);
		}
	}
	public void print_reversed_array()
	{
		System.out.println("Reversed Array");
		for(int j=array1.length-1;j>=0;j--)
		{
			System.out.println(array1[j]);
		}
	}
}

public class Reverse_array {

	public static void main(String[] args) 
	{
		
		int[] arr= {12,56,23,12,34,89,13,25};
		array obj=new array(arr);
		obj.print_array();
		obj.print_reversed_array();

		
		

	}

}
