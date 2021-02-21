package day1.com.java.code;

public class SecondLargest 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,a;
		int[] array= {1,8,45,34,21};
		for(i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					a=array[i];
					array[i]=array[j];
					array[j]=a;
					
				}
				
			}
		}
		System.out.println("************************");
		System.out.println("Second largest number is:");
		System.out.println(array[array.length-2]);
		

	}

}
