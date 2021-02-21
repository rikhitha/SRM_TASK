package diamond.problem.multiple.inheritance;

public class Internal2 
{
	public int subj1=25;
	public int subj2=27;
	public int subj3=28;
	
	
		public void avg2()
		{
			int total;
			total=subj1+subj2+subj3;
			System.out.println("TotalMarks for internal_1 ="+total);
			int avg;
			avg=total/3;
			System.out.println("Average for internal_2="+avg);		
			
		}

};
