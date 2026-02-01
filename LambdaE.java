// @FunctionalInterface
// interface A 
// {
//     void display();
// }

// public class LambdaE {
//     public static void main(String[] args) 
//     {
//         // lambda expression can be used only when there is one method in interface 
//         // lambda expression is known as anonymous function and it doesnt require class implementation and its work is to provide the implementation of method of interface

//         A a = ()-> {   
//             System.out.println("this is functional interface example using lambda expression");  
//         };
//         a.display();
//     }
    
// }

// *******lambda with parameters************ 

// @FunctionalInterface
// interface Addable
// {
//     int add(int a, int b);
// }   
// public class LambdaE
// {
//     public static void main(String[] args) 
//     {
//         Addable ad1 = (a, b) -> (a + b);  
//         System.out.println(ad1.add(10, 20));  

//         Addable ad2 = (int a, int b) -> (a + b);  
//         System.out.println(ad2.add(100, 200));  
//     }
// }

// **********lambda with return type**************
// @FunctionalInterface
// interface Addable {
//     int add(int a, int b);
// }
// public class LambdaE {
//     public static void main(String[] args) 
//     {
//         Addable ad = (a, b) -> {
//             return (a + b);
//         };
//         System.out.println(ad.add(50, 70));
//     }
// }

// +++ or we can try +++++

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}   
public class LambdaE {
    public static void main(String[] args) 
    {
        Addable ad = (a, b) -> a + b;
        
        System.out.println(ad.add(30, 40));
    }
}