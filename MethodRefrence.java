import java.util.*;
import java.util.stream.Stream;
public class MethodRefrence {
    public static void main(String[] args){
        List<String> ls = Arrays.asList("piu" , "Anil", "Lalo");
        List<String> s1 = ls.stream()
        // .map(str -> str.toUpperCase())
                               .map(String::toUpperCase)
                               .toList(); 
        // s1.forEach(str -> System.out.println(str));
        s1.forEach(System.out::println);
        // for using the method reference we can use the :: operator to refer to the method of the class or object.  
        // Here we are using the method reference to convert the string to upper case and then printing it using the method reference of println
        // The method reference is a shorthand notation of lambda expression which is used to refer to a method without invoking it.
        // It is used to make the code more readable and concise. 
        // It can be used with static methods, instance methods, and constructors of the class or object.
        // It can be used with functional interfaces, which are interfaces that have a single abstract method. 
        // The method reference can be used to refer to the method of the functional interface.
        // It is a way to pass a method as an argument to another method. 
        // which method we use in stream to filter elements based on chracter size and then convert them to upper case and then sort in alphabetical order print them using method reference.
        // .filter(str -> str.length() > 3)
        // .map(String::toUpperCase)
        // .sorted()
        // It can be used with the Stream API to perform operations on collections of data in a more efficient and readable way.
    }
    
}
