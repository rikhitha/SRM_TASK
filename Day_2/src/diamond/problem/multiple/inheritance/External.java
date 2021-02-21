package diamond.problem.multiple.inheritance;

public class External extends Internal1,Internal2
{

	public static void main(String[] args) 
	{
		External object1=new External();
		System.out.println("Student Details");
		object1.details();
		String name="Swathi";
		String Regno="ra1832241020007";
		System.out.println("Internal-1 Marks");
		object1.avg1();
		System.out.println("Internal-2 Marks");
		object1.avg2();
		
	}

}
