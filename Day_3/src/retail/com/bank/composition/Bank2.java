package retail.com.bank.composition;

import java.util.ArrayList;
import java.util.List;

public class Bank2 {

	public static void main(String[] args) 
	{
		Emp e1=new Emp(12543,"Nethika");
		Emp e2=new Emp(78543,"princy");
		Emp e3=new Emp(12543,"varun");
		List<Emp> emp=new ArrayList<Emp>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		cus cusobj=new cus(emp);
		List<Emp> emps=cusobj.getnoofemployee();
		for(Emp em:emps)
		{
			System.out.println("Employee id"+em.empid);
			System.out.println("Employee id"+em.empname);
			
			
		}
		
		
		
		

	}

}
