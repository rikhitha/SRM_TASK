package day5.files.java.code.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class write
{
	public void writeToFile(List<String> validate)
	{
		try{  
            FileOutputStream fileOut = new FileOutputStream("C:/Users/HP/Desktop/SRMWORK/val.txt");  
			ObjectOutputStream oos = new ObjectOutputStream (fileOut);  
            oos.writeObject (validate);  
            System.out.println("Records stored in val.txt");
        }
		catch(Exception e)
		{  
            System.err.println(e.getMessage());  
        }  
	}
	public void writeerrorToFile(List<String> notvalid)
	{
		try{  
            FileOutputStream fileOut = new FileOutputStream("C:/Users/HP/Desktop/SRMWORK/notval.txt");  
			ObjectOutputStream oos = new ObjectOutputStream (fileOut);  
            oos.writeObject (notvalid);  
            System.out.println("Records stored in notval.txt");
        }
		catch(Exception e)
		{  
            System.err.println(e.getMessage());  
        }  
	}
}

public class Read_file {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner s = new Scanner(new File("C:/Users/HP/Desktop/SRMWORK/day_5.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		System.out.println(list);
		List<String> validate=list.stream().filter(v->v.length()>3).collect(Collectors.toList());
		System.out.println(validate);
		List<String> errorrecord=list.stream().filter(p->p.length()<=3).collect(Collectors.toList());
		System.out.println(errorrecord);
		write ob=new write();
		ob.writeToFile(validate);
		ob.writeerrorToFile(errorrecord);
		

	}

	
	

}
