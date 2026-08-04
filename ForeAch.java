import java.util.*;
import java.util.function.Consumer;

// forEach is a new feature in Java 8 which allows us to iterate over collections of objects in a functional style.
// it's a terminal operation that takes a lambda expression or method reference as an argument and applies it to each element of the collection.
// its like a for loop, but it is more concise and expressive. 
// The forEach method can be used with various data sources, including collections, arrays, and I/O channels.
public class ForeAch {
    public static void main(String a[]){ 

    List<Integer> ls = Arrays.asList(2,5,8,9,6,3,4,7);
   
    // forEach method take an object of Consumer interface as an argument, 
    // which is a functional interface that has a single abstract method called accept().
    // The accept() method takes a single argument and performs some operation on it.
    Consumer<Integer> con = new Consumer<Integer>(){
        
        public void accept(Integer n){
            if(n%2 == 0){
                n*=2;
                // s[0]+=n;
               System.out.println(n); 
            }
            

        }
         

    };
    ls.forEach(con);

// Consumer<Integer> con = (n) -> {if(n%2 == 0)
                // n*=2;
    //             // s[0]+=n;
    //            System.out.println(n); };

    // ls.forEach(con);







    
    // here we are using regular for loop to iterate over the list and perform some operations on the elements.
    // int sum = 0;
    // for (int i =0; i< ls.size(); i++) {
    //     int num = ls.get(i);
    //     if(num %2 ==0){
    //         num = num*2;
    //         sum += num;
    //     }
    // }



    // now we used the advanced for loop to iterate over the list and perform some operations on the elements.
    // int sum = 0;
    // for(Integer num : ls){
    //     if(num%2 == 0){
    //         num *= 2;
    //         sum += num;
    //     }
    // }
    
    
}
}
