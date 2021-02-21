package product.Pricing;

public class product_pricing_implement extends Get_Product_Price
{
	
	public product_pricing_implement(int productid,String productname)
	{
		this.productid=productid;
		this.productname=productname;
	}
	public int getproductid()
	{
		return productid;
	}
	public void setproductid(int productid)
	{
		this.productid=productid;
	}
	public void setproductname(String productname)
	{
		this.productname=productname;
	}
	public String getproductname()
	{
		return productname;
	}

	@Override
	public void price_List()
	{
		int price;
		if(productname=="backpack")
		{
		 price=3000;
		 System.out.println("Productname="+" "+productname+",,"+"Productid="+" "+productid+" "+"Price="+" "+price);
		 	
		}
		if(productname=="clutch")
		{
			price=1500;
			System.out.println("Productname="+" "+productname+",,"+"Productid="+" "+productid+" "+"Price="+" "+price);
		}
		
	}
	

}
