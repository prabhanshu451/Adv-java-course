import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class StreaMapi
// StremApi is a new feature in Java 8 which allows us to process collections of objects in a functional style.
// It provides a way to perform operations on sequences of elements, such as filtering, mapping, and reducing, using a fluent API. 
// The Stream API can be used with various data sources, including collections, arrays, and I/O channels.


// Need of Stream API: The Stream API is useful for processing large collections of data in a more efficient and readable way. 
// It allows us to perform operations on data in parallel, which can improve performance for large datasets. 
// Additionally, the Stream API provides a more concise and expressive way to write code, making it easier to read and maintain.
{
    // Stream is only used once, it cannot be reused. Once a stream has been consumed, it cannot be used again.
    public static void main(String a[])
    {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,5,6,7,8,9);
        // Stream<Integer> st = ls.stream();
        // Stream<Integer> st1 = st.filter(n -> n%2 == 0);
        // Stream<Integer> st2 = st1.map(n -> n*2);
        // int sum = st2.reduce(0,(c, e) -> c +e );


        // The above code can be written in a single line as below

        // int sum = ls.stream()
        //              .filter(n -> n%2 == 0)
        //              .map(n -> n*2)
        //              .reduce(0, (c,e) -> c + e);


        // now lets expand the above method with the help of method refrences 
        // first we see for the filter method we can use the method refrence as below
        // filter method take predicate as an argument which is a functional interface that has a single abstract method called test() 
        // which takes an argument and returns a boolean value.    
        Predicate<Integer> p = new Predicate<Integer>(){
        public boolean test(Integer n){
            if(n%2 == 0){
                return true;
            
            }else
{
                return false;
            }}

        };
        // map method take function as an argument which is a functional interface that has a single abstract method called apply()
        Function<Integer, Integer> f = new Function<Integer, Integer>(){
            public Integer apply(Integer n){
               return n*2;
            }

        };




        int sum1 = ls.stream()
                     .filter(p)
                     .map(f)
                     .reduce(0, (c,e) -> c + e);
        
        System.out.println("Sum of doubled even numbers: " + sum1);
        // st2.forEach(n -> System.out.println(n));
    }
    
}
