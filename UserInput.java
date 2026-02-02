import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
// user input handling class 
// user input is given through buffered reader and scanner
// this class will handle all user inputs for the application
public class UserInput {
    public static void main(String[] args) throws IOException
    {
        // Using Scanner to take user input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name ");
        String na = sc.nextLine();
        System.out.println("Hello, " + na );
        sc.close();


        // Using BufferedReader to take user input
        // when we use buffered reader we have to handle IOException
        // and also convert the input string to required data type if needed
        System.out.println("Enter your name: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        String name = bf.readLine();
        System.out.println("Hello, " + name);
        bf.close();
    }
    
}
