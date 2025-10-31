// interface is not a class but a reference type in Java
// it is similar to class

interface Ab 
{
    void display();
    // every method in interface is by default abstract and public. So, no need to write {public abstract void display();}

    // we cannot create object of interface
    
    // we can create reference variable of interface and assign it to the object of class which implements that interface
    
    int age = 10; // in interface the variables are by default final and static means we cannot change the value of variable 

    // we cannot create constructor in interface
    // we can achieve abstraction using interface
    // interface is gives you the design of the class

}
// we can achieve multiple inheritance using interface
interface X
{
    void show();
}

interface Y extends X
// now interface Y is inheriting interface X
{

}

class  Bd implements Ab, Y
// class Bd implements Ab, X
// we use implements keyword to implement the interface and in implemets we only get the method declaration not the method body
//  and not the variables
{
    public void display()
    {
        System.out.println("displaying from class Bd");
    }
    public void show()
    {
        System.out.println("showing from class Bd ");
    }
}

public class Interf 
{
    public static void main(String[] args)
    {
        Ab obj = new Bd();
        obj.display();

        X obj2 = new Bd();
        obj2.show();

        Y obj1 = new Bd();
        obj1.show();


        System.out.println(Ab.age);
    }
    
}

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
 