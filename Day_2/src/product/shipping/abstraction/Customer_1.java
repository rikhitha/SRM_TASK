package product.shipping.abstraction;

abstract public class Customer_1 
{
	public int item_no=12003;
	public String item_name="Backpack";
	private int credit_card_num=123456789;
	public int mobile=1233456;
	public abstract void check_discount();
	public void check_availability(int chk)
	{
		if(chk==1)
		{
			System.out.println("Order placed");
			
		}
		else
		{
			System.out.println("Order cancelled");
		}
		
	}
	
	

}
