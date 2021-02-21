package product.shipping.abstraction;
import product.Pricing.product_pricing_implement;
class Order
{
	 private long orderNumber;
	 private long orderTotal;

	 public Order()
	 {
	 }

	 public boolean getInfo()
	 {
	  return true;
	 }

	 public long calcTotalValue()
	 {
	  return 2400;
	 }

	 public long getOrderNumber()
	 {
	  return orderNumber;
	 }
	 public void setOrderNumber(long aOrderNumber)
	 {
	  orderNumber = aOrderNumber;
	 }

	 public long getOrderTotal()
	 {
	  return orderTotal;
	 }

	 public void setOrderTotal(long aOrderTotal)
	 {
	  orderTotal = aOrderTotal;
	 }
}
public class Shipping extends Check
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int d=1;
		Shipping shpt=new Shipping();
		shpt.check_availability(d);
		System.out.println("Item Number="+shpt.item_no);
		System.out.println("Item Name="+shpt.item_name);
		shpt.check_discount();
		Order order = new Order();
		System.out.println("instantiated Order");
		
	    System.out.println("Amount Saved="+order.calcTotalValue());
	    product_pricing_implement objpp=new product_pricing_implement(12,"backpack");
	    objpp.price_List();
		  
		 }
		
		
	

}
