package retail.com.bank.aggregation;

public class Customer_Refernece 
{
	public int Cusid=10023;
	public String cusname="Felix";
	public int CusAcntNum=345678912;
	public  void openaccount() 
	{
		System.out.println("Account Created ");
		System.out.println("Customer Name"+cusname);
		System.out.println("Customerid"+Cusid);
		System.out.println("Account Number"+CusAcntNum);
		
	}
	
	public void Emp_Details(int empid) {
		int e=empid;
		System.out.println("Account created by"+e);
		
	}

}
