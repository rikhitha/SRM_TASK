package day5.files.java.code.com;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class hashcode_file {

	public static void main(String[] args) throws IOException
	{
		Path path  = Paths.get("C:/Users/HP/Desktop/SRMWORK/day_5.txt"); 
    int hashCode = path.hashCode(); 
    System.out.println("Hash Code: "
                       + hashCode); 
		

	}

}
