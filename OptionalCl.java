import java.util.*;

public class OptionalCl {
    public static void main(String[]  a){
        List<String> ls = Arrays.asList("Piu", "okjh", "Anil", "Lalo");

        // Optional class is used to as a container object to represent the presence or absence of a non-null value, 
        // primarily to prevent NullPointerException crashes. 
        Optional<String> op = ls.stream()
                                .filter(str -> str.contains("i"))
                                .findAny();
        System.out.println(op.orElse("Not Found") );
        // here we can also print the customized error message


        // This can also done by without using the optional by adding the orElse as a stream method 
        // String op = ls.stream()
        //                 .filter(str -> str.contains("i"))
        //                 .findFirst()
        //                 .orElse("Not Found");
        // System.out.println(op);

    }
}
