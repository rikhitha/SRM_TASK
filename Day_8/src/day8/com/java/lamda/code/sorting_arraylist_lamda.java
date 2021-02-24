package day8.com.java.lamda.code;

import java.util.ArrayList;
class Cus
{
	int age;
    String FirstName,LastName,Email;
    public int getage()
    {
    	return age;
    }
    public String getfirstname()
    {
    	return FirstName;
    }
    public Cus(int age, String FirstName, String LastName ,String Email)
    {
        this.age = age;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email=Email;
    }
    public String toString()
    {
        return "Age"+" "+this.age + " " + "FirstName" +" "+ this.FirstName +
                           " " +"LastName"+" "+ this.LastName+" "+"Email"+" "+this.Email;
    }
    
}


public class sorting_arraylist_lamda 
{

	public static void main(String[] args) 
	{
		ArrayList<Cus> customerlist = new ArrayList<Cus>();
		customerlist.add(new Cus(11, "arvi", "Mehtha","mm123@gmail.com"));
		customerlist.add(new Cus(13, "banston", "dicas","ac342@gmail.com"));
		customerlist.add(new Cus(12, "cim", "Zaveesh","zz347@gmail.com"));
        System.out.println("Before Sorting");
        customerlist.forEach((p)->System.out.println(p));
        System.out.println("Sorting by Customer age");
        customerlist.sort((Cus c1,Cus c2)->c1.getage()-c2.getage());
        customerlist.forEach((h)->System.out.println(h));
        System.out.println("Sorting by Customer name");
        customerlist.sort((Cus c1,Cus c2)->c1.getfirstname().compareTo(c2.getfirstname()));
        customerlist.forEach((j)->System.out.println(j));
        
        
		
	}
}
