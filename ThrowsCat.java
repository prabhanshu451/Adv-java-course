class Andy{
    public void show() throws Exception 
    // thows keyword is used to declare an exception and it is used with method signature and 
    // it informs the caller of the method that this method may throw an exception.
    // It is used for checked exceptions. and it is used to propagate the exception to the caller method.
    {
        Class.forName("calc");
        // Class.forName() method is used to load the class dynamically at runtime.
        // it throws ClassNotFoundException which is a checked exception.
    }}


public class ThrowsCat {
    public static void main(String[] args)
    {
         Andy obj1 = new Andy();
        //  obj1.show(); // it will give compile time error because show() method throws checked exception.
        // so we have to handle the exception using try-catch block.
       
        
        try {
             obj1.show();
           
        }
        catch (Exception e) {
            System.out.println("Class not found:" + e);
        }
        

    }
    
}
