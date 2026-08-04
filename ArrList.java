
import java.util.*;
public class ArrList {
    public static void main(String[] args){
        // Always use the interface type as the reference type with the data type as the generic type "<Integer>"
        // Collection<Integer> nums = new ArrayList<Integer>();
        // nums.add(4);
        // nums.add(5);
        // nums.add(6);            
        // nums.add(7);
        // System.out.println(nums);
        // for(Integer i: nums){
        //     System.out.println(i);
        // }
        // Through this we can see that the order of the elements is preserved in the ArrayList but 
        // can't check the index of the elements in the ArrayList as it is a Collection type.
        // for that we need to use the "List" interface type as the reference type.
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);    
        nums.add(6);
        nums.add(7);

        System.out.println(nums.get(2));
        System.out.println(nums.lastIndexOf(7));

        // ArrayList can be initialized with a collection type as well. 
        // ArrayList also support duplicate elements and null values.
        // ArrayList is a resizable array implementation of the List interface. It is a part of the Java Collections Framework.
        // and it is not synchronized. It is a good choice when we need to store a large number of elements and we need to access them frequently.
        // and helps in reducing the time and space complexity of the program 
        // and works fine with the primitive data types as well as the wrapper classes of the primitive data types. 
    }
    
}
