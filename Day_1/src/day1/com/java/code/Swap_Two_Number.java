package day1.com.java.code;
class swap1
{
	public void swap(int a,int b)
    {
    	int num1=a;
    	int num2=b;
    	num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping");
        System.out.println("Number1::"+num1);
        System.out.println("Number2::"+num2);
    }
}
public class Swap_Two_Number
{

	public static void main(String[] args) 
	{
	    
        int n1=12;
        int n2=13;
        System.out.println("Before swapping");
        System.out.println("Number1::"+n1);
        System.out.println("Number2::"+n2);
        swap1 ob=new swap1();
        ob.swap(n1, n2);
        
        
	}

}
