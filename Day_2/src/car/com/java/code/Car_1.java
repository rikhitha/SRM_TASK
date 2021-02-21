package car.com.java.code;

public class Car_1 extends Parent_Vehicle 
{
	public static void main(String[] args) 
	{
	 Parent_Vehicle obj=new Car_1();
     obj.start();
     obj.stop();
     int se=obj.seats;
     System.out.println("no of seats is :" +se);
     obj.get_color("Black");
     obj.cruise_control(0);
     }

}
