import java.util.*;
public class MaP {
    public static void main(String[] a){
        Map<String, Integer> map = new HashMap<>();
        map.put("non", 25);
        // put is used to add key-value pair in map
        map.put("noon", 5);
        map.put("nn", 125);
        map.put("no", 205);
        System.out.println(map);
        // Map is an interface in java which is used to store key-value pairs. It is a part of java.util package. 
        // It is not a child interface of collection interface
        // HashMap is a class which implements Map interface.
        // It is not a child class of collection class. It is a child class of AbstractMap class. 
        // It is not synchronized. It allows null key and null values. It does not maintain any order of its elements.
        System.out.println(map.get("noon")); // get is used to get the value of a key in map
        System.out.println(map.containsKey("noon")); // containsKey is used to check if the key is present in map or not
        System.out.println(map.containsValue(5)); // containsValue is used to check if the value is present in map or not
        System.out.println(map.remove("noon")); // remove is used to remove the key-value pair from map
        System.out.println(map); 


        System.out.println("using repalce " + map.replace("noon", 5, 105)); // replace is used to replace the value of a key 
        // if the key is present in map and the old value is same as the new value
        System.out.println(map);
        System.out.println(map.keySet()); // keySet is used to get all the keys present in map
    }
    
}
