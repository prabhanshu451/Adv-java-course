// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// public class TryResource 
// {
//     public static void main(String[] args) throws Exception
//     {
//         int i = 2;
//         int j = 0;
//         try {
//             j= 10/ i;
//             InputStreamReader isr = new InputStreamReader(System.in);
//             BufferedReader br = new BufferedReader(isr);
//             System.out.println("Enter a number: ");
//             Integer num = Integer.parseInt(br.readLine());  
            
//         }
//         finally{
// finally is used to execute the code whether exception occurs or not and it is used to close the resources(it can be used with try-catch also).
// the resources opened in try block should be closed in finally block.and resource can be a file or database connection etc.
            
//             System.out.println("In finally block");
//         }
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TryResource 
{
    public static void main(String[] args) throws Exception
    {
        int i = 2;
        int j = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        // try with resources is used to close the resources automatically after use.it is used with only try block.
        // in try block we can declare and initialize the resource.
        {
            j = 10/ i;
            System.out.println("Enter a number: ");
            Integer num = Integer.parseInt(br.readLine());

        }
    }
}