class PiyuException extends Exception
// this is custom exception class
// it is user defined exception and it extends Exception class and it is checked exception
{

    public PiyuException(String message) 
    // it is constructor and it takes message as parameter and passes it to super class Exception
    {
        super(message);
        // super keyword is used to call the constructor of parent class and pass the message and used to initialize the message of exception
    }
}


public class ThCustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try 
        {
            j = 18 / i;
            if (j == 0) {
                throw new PiyuException("Custom Exception: Division result is zero");
                // 
            }
        } 
        catch (PiyuException e) {
            j = 18 / 1;
            System.out.println(e.getMessage());
            System.out.println("Error corrected");
        }
        System.out.println(j);
    }  
    
}
