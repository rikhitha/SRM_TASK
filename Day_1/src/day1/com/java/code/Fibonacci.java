package day1.com.java.code;
class print_series
{
	public void get_value(int n)
	{
		int num1=0,num2=1,sum=0;
		for( int i=0;i<n;i++)
		{
			if(i<=1)
			{
				sum=i;
			}
			else
			{
				sum=num1+num2;
				num1=num2;
				num2=sum;
			}
			System.out.println(sum);
		}
	}
	
}

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		print_series ob=new print_series();
		ob.get_value(n);
		
		
		
		
	}

}
