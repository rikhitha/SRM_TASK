package day3.com.collections.java.code;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
class Value
{
	int count;

	Value(int count)
	{
		this.count=count;
		
	}
	public int getcount()
	{
		return count;
	}
	public void setcount(int count)
	{
		this.count=count;
	}
	public void check_odd()
	{
		List<Integer> num =new ArrayList<Integer>();
		num.add(23);
		num.add(87);
		num.add(13);
		num.add(23);
		num.add(67);
		num.add(27);
		for(int i=0;i<num.size();i++)
		{
			if(num.indexOf(i)%2==0)
			{
				count++;
			}
		}
		
	if(count>0)
	{
		System.out.println("All integers in list are not odd numbers");
			
	}
	else
	{
		System.out.println("All integers in list are odd numbers");
	}
		
	}
	
}

public class List_odd implements Serializable
{

	public static void main(String[] args) 
	{
		Value obj=new Value(0);
		obj.check_odd();
		
	}

	

}
