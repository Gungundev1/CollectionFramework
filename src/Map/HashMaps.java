package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("A","Apple");// add element
        map.put("B","Banana");
        map.put("C","Apple");//don't allow duplicate key but allow duplicate values
        System.out.println(map);
        System.out.println(map.get("A"));// return value of key

        System.out.println(map.getOrDefault("d","others"));//if key is in map return value otherwise return default value
        map.remove("C");
        System.out.println(map);
        ArrayList<String> keys = new ArrayList<>(map.keySet());// print only key values
        System.out.println(keys);

        ArrayList<String> values=new ArrayList<>(map.values());// print only values
        System.out.println(values);

        Set<Map.Entry<String,String>> entries=map.entrySet();// print key with value
        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+" = " +entry.getValue());
        }
    }
}
