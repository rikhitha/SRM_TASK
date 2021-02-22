package retail.com.bank.composition;

import java.util.List;

public class cus 
{
	private final List<Emp> emps;
	cus(List<Emp> emps)
	{
		this.emps=emps;
	}
	
	public List<Emp> getnoofemployee() {
		// TODO Auto-generated method stub
		return emps;
	}

}
