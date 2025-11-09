interface Computer 
{
   void code();
    
}
class Laptop implements Computer 
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer 
{
    public void code() 
    {
        System.out.println("code, compile, run : faster");
    }
}
class Developer 
{
    void devApp(Computer lap)
    {
        lap.code();
    }
}


// need of interface is to achieve abstraction and multiple inheritance and to achieve loose coupling

// loose coupling means that the implementation and the usage of the class should be independent
// so that the changes in the implementation should not affect the usage part 
// for achieving loose coupling we use interface

// for example in the above code Developer class is using Computer interface reference
// so the developer class is not dependent on any specific implementation of computer
// so if we change the implementation of computer class it will not affect the developer class
// this is called loose coupling

// if we had used Laptop class directly in Developer class then it would have been tightly coupled
// because any change in Laptop class would have affected the Developer class

// by using interface we have achieved loose coupling

// this is the need of interface in java    

public class NeedInterf 
{
    public static void main(String[] args) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer ();
        dev.devApp(desk);
    }
    
}
