package day8.com.java.lamda.code;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
 
public class SortMapByValuesProgram 
{
    public static void main(String[] args) 
    {
        
         
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
         
        
         
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
         
        
         
        Map<Integer, String> sortedIdNameMap 
        = idNameMap.entrySet()
                   .stream()
                   .sorted(Entry.comparingByValue((o1, o2) -> o1.length() - o2.length()))
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
 
        
         
        System.out.println("Before Sorting : ");
         
        System.out.println(idNameMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedIdNameMap);
    }
}