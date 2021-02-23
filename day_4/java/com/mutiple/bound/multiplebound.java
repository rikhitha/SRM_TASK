package java.com.mutiple.bound;

public class multiplebound<T extends task_evaluation & task> 
{
	T obj;
	multiplebound(T obj)
	{
		this.obj=obj;
		
	}
	public void internal1()
	{
		this.obj.external1();
	}
	public void internal2()
	{
		this.obj.external2();
	}

}
