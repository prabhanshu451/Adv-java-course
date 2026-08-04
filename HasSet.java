
import java.util.*;
public class HasSet {
    public static void main(String[] args){
        // Collection<Integer> nums = new HashSet<Integer>();

        // Set<Integer> nums = new HashSet<Integer>();
        // HashSet is used to store the elements in random order and it does not allow duplicate elements.

        Set<Integer> nums = new TreeSet<Integer>();
        // TreeSet is used to store the elements in sorted order and it does not allow duplicate elements.
        nums.add(1);
        nums.add(22);
        nums.add(3);
        nums.add(14);

        System.out.println(nums);
    }
}
