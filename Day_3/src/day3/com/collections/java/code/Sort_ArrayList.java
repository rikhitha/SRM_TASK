package day3.com.collections.java.code;

import java.util.*;
import java.lang.*;
import java.io.*;
class Customer
{
    int age;
    String FirstName,LastName,Email;
 
    
    public Customer(int age, String FirstName, String LastName ,String Email)
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
 
 
class Sortbyage implements Comparator<Customer>
{
    
    public int compare(Customer a, Customer b)
    {
        return b.age - a.age;
    }
}
class SortByFirstName implements Comparator<Customer>
{
    
    public int compare(Customer a, Customer b)
    {
        return b.FirstName.compareTo(a.FirstName);
    }
}

public class Sort_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<Customer> ar = new ArrayList<Customer>();
        ar.add(new Customer(11, "arvi", "Mehtha","mm123@gmail.com"));
        ar.add(new Customer(13, "banston", "dicas","ac342@gmail.com"));
        ar.add(new Customer(12, "cim", "Zaveesh","zz347@gmail.com"));
 
        System.out.println("Unsorted Arraylist");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyage());
 
        System.out.println("\nSorted by Age of Customer");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new SortByFirstName());
 
        System.out.println("\nSorted by FirstName of Customer");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		

	}

}
