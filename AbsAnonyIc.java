abstract class A 
{
    public abstract void show();
}
// class B extends A
// {
//     public void show()
//     {
//         System.out.println("show is going in class B");
//     }

// }



// when we have to implement interface or abstract class only once we use anonymous Inner class

public class AbsAnonyIc 
{
    public static void main(String[] args)
    {
        A obj = new A() 
        // here we are creating the object of abstract class A but we cannot create the object of abstract class so we are creating
        // the object of anonymous inner class which is extending the abstract class A

        {
           public void show()
           {
               System.out.println("show is going in anonymous class");
           } 
        };
        obj.show();
    }
    
}
