package day3.com.collections.java.code;
import java.io.*; 
import java.util.*; 
class RevArrayList { 
  
    
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) 
    { 
        
        for (int i = 0; i < alist.size() / 2; i++) { 
            Integer temp = alist.get(i); 
            alist.set(i, alist.get(alist.size() - i - 1)); 
            alist.set(alist.size() - i - 1, temp); 
        } 
  
        
        return alist; 
    } 
  
     
    public void printElements(ArrayList<Integer> alist) 
    { 
        for (int i = 0; i < alist.size(); i++) { 
            System.out.print(alist.get(i) + " "); 
        } 
    } 
} 
  
public class Reverse_arraylist { 
    public static void main(String[] args) 
    { 
        RevArrayList obj = new RevArrayList(); 
        ArrayList<Integer> arrayli = new ArrayList<Integer>(); 
  
        arrayli.add(new Integer(12)); 
        arrayli.add(new Integer(13)); 
        arrayli.add(new Integer(123)); 
        arrayli.add(new Integer(54)); 
        arrayli.add(new Integer(1)); 
        System.out.print("Elements before reversing: "); 
        obj.printElements(arrayli); 
        arrayli = obj.reverseArrayList(arrayli); 
        System.out.print("\nElements after reversing: "); 
        obj.printElements(arrayli); 
    } 
} 

