import java.util.*;  
public class HashMap2{  
 public static void main(String args[]){  
   HashMap<String,String> map=new HashMap<String,String>();    
   map.put("ada","Mango");   
   map.put("ad","Apple");    
   map.put("ab","Banana");   
   map.put("ada","Grapes");
   map.put("ad", null);
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}
