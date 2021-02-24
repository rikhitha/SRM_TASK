package day8.com.java.lamda.code;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	private int age;
	private String FirstName;
	private String LastName;
	private String Email;
public Customer(int age,String FirstName,String LastName,String Email)
{
	this.age=age;
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
}
public int getage()
{
	return age;
}
public void setage(int age)
{
	this.age=age;
}

public String getFirstName()
{
	return FirstName;
}
public void setFirstName(String FirstName)
{
	this.FirstName=FirstName;
}
public String getLastName()
{
	return LastName;
}
public void setLastName(String LastName)
{
	this.LastName=LastName;
}
public String getEmail()
{
	return Email;
}
public void setEmail(String Email)
{
	this.Email=Email;
}
}

public class Customer_Filter 
{

	public static void main(String[] args) 
	{
		int aged= 12;
		String name="banston";
		List<Customer> Customerobj=new ArrayList<>();
		Customerobj.add(new Customer(11, "arvi", "Mehtha","mm123@gmail.com"));
		Customerobj.add(new Customer(13, "banston", "dicas","ac342@gmail.com"));
		Customerobj.add(new Customer(12, "cim", "Zaveesh","zz347@gmail.com"));
		
		Customerobj.forEach(customer ->
        {
        	if(customer.getFirstName()==name && customer.getage()==aged)
        	{
            System.out.println("Age : " + customer.getage() + ", FirstName : " + customer.getFirstName()+ ", LastName : " + customer.getLastName()+ ", Email : " + customer.getEmail());
        	}
        	
        }
        );


	}

}

