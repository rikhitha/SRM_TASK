package retail.com.bank.aggregation;

public class Employee_Refernce 
{
	Customer_Refernece obj;
	public int empid=1521;
	
	public void CollectMoney()
	{
		obj=new Customer_Refernece();
		obj.openaccount();
		obj.Emp_Details(empid);
		
		
	}

}
