// public class ThrowCat {
//     public static void main(String[] args) 
//     {
//         int i = 0;
//         int j = 0;
//         try 
//         {
//             j = 18/ i;
            
//         }
//         catch (ArithmeticException e) 
//         {
//             j = 18 / 1;
//             System.out.println("error Corrected");

//         }
//         System.out.println(j);
//     }
    
// }
public class ThrowCat {
    public static void main(String[] args) 
    {
        int i = 20;
        int j =0;
    
    try 
    {
        j = 18 / i;
        if (j == 0)
        {
            throw new ArithmeticException();
            // throw keyword is used to explicitly throw an exception
            // we can throw either checked or unchecked exception using throw keyword
            // syntax: throw new ExceptionType("optional message");
            
        }


    }
    catch (ArithmeticException e) 
    {
        j = 18 / 1;
        System.out.println("error Corrected");
    }
    System.out.println(j);
}
}
