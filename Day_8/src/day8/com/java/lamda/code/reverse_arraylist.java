package day8.com.java.lamda.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
 
class reverse_arraylist
{
    public static<T> List<T> reverseList(List<T> list)
    {
        return IntStream.range(0, list.size())
                        .map(i -> (list.size() - 1 - i))    
                        .mapToObj(list::get)                
                        .collect(Collectors.toCollection(ArrayList::new));
    }
 
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}