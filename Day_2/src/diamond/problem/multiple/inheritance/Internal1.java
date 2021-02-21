package diamond.problem.multiple.inheritance;

public class Internal1 extends Details
{
	public int subject1=25;
	public int subject2=37;
	public int subject3=38;
	
	
		public void avg1()
		{
			int total;
			total=subject1+subject2+subject3;
			System.out.println("TotalMarks for internal_1="+total);
			int avg;
			avg=total/3;
			System.out.println("Average for internal_1="+avg);		
			
		}

};
