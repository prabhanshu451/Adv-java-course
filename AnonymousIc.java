class A 
{
    int age;
    public void show()
    {
        System.out.println("show is going");
    }

}
public class AnonymousIc {
    public static void main(String[] args)
    {
        // when we create the object of class A like this
        // then it will call the show method of class A and print the things
        // A obj1 = new A();
        // obj1.show();
        // but if we want to change the show method of class A without changing the code of class A
        // then we can use anonymous inner class
        


        // for anonymous inner class we make object of class and but pass the method in that object so it writes the object of 
        // Anonymous inner class 
        A obj = new A()
        {
            public void show()
            {
                System.out.println("show is going in anonymous class");
            }
        };
        obj.show();
        // here it is showing the method of anonymous inner class
    }
    
}
