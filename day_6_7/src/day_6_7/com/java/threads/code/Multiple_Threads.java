package day_6_7.com.java.threads.code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class Multiple_Threads {
   
    public static void main(String[] args) 
    {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        long startTime = System.nanoTime();
        File dir = new File("C:/Users/HP/Desktop/SRMWORK");
        File destination = new File("C:/Users/HP/Desktop/SRMWORK/day_6N7.txt");
        File[] files = dir.listFiles();
        for (File file : files) {
            Writer w1 = new Writer(file, destination);
            Thread t = new Thread(w1);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
           
        }
        long stopTime = System.nanoTime();
       
   
System.out.println("Total execution time is "+(stopTime - startTime));
       
    }
 
}
 
class Writer implements Runnable{
File source;
File destination;
    public Writer(File source,File destination) {
this.source = source;
this.destination = destination;
    }
    @Override
    public void run() {
        String content;
        content =   readFromFile(source.getAbsolutePath());
        writeToFile(destination,content);      
    }
   
    private static void writeToFile(File file,String content) {
        try {
            @SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write(content);
            writer.write("file content written");
            writer.flush();
        } catch (IOException e) {
          
            e.printStackTrace();
        }
       
       
    }
 
    static String readFromFile(String filename){
        StringBuffer content = new StringBuffer();
        try {
            String text;
            @SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(filename));
                while((text = reader.readLine())!=null){
                    content.append(text);
                    content.append("\n");
                   
                }
             
        } catch (FileNotFoundException e) {
      
            e.printStackTrace();
        }
        catch (IOException e) {
           
            e.printStackTrace();
        }
    return content.toString(); 
    }
 
   
}