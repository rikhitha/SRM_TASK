package retail.com.bank.realization;

public class Bank implements Employee,Customer {

	public static void main(String[] args) 
	{
		int bankid=34567;
		String BankName="jenseva";
		System.out.println("bank id"+ bankid);
		System.out.println("Bank Name"+ BankName);
		Bank obj=new Bank();
		obj.CollectMoney();
		obj.openaccount();
		obj.closeaccount();

	

	}

	@Override
	public void CollectMoney() {
		
		System.out.println("Employee id"+ empid);
		System.out.println("Bank Name"+ empname);
		System.out.println("Money Collected from"+cusname);
		
		
	}

	@Override
	public void openaccount() 
	{
		System.out.println("Account Created ");
		System.out.println("Customer Name"+cusname);
		System.out.println("Customerid"+Cusid);
		System.out.println("Account Number"+CusAcntNum);
		
		
	}

	@Override
	public void closeaccount() 
	{
		System.out.println(cusname+" "+Cusid+" "+"Account Closed");
		
	}
}
