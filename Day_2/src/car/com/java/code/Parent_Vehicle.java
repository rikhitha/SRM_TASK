package car.com.java.code;

public class Parent_Vehicle 
{
    int seats=4;
   
	public void start()
	{
		System.out.println("Started-Parent_Vehicle class");
	}
	public void stop()
	{
		System.out.println("Stopped_Parent_Vehicle class");
	}
	public void get_color(String appearance)
	{
		System.out.println("Color" +appearance);
	}
	public void cruise_control(int val)
	{
		if(val==1)
		{
			System.out.println("Cruise System Enabled");
		}
		else
		{
			System.out.println("Cruise System Not Enabled");
		}
			
	}
	
}
