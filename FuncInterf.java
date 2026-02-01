// this is a functional interface example

// this is also a annotation so that by mistake we cant make more than one method in an interface 
@FunctionalInterface
interface A 
{
    void display();
}

class B implements A
{
    public void display()
    {
        System.out.println("this is functional interface example");
    }
}
public class FuncInterf {
    public static void main(String[] args) 
    {

        //     A a = ()-> this is lambda expression if we didnt define class that implements interface A then we can use lambda expression
        // A a = ()->{   System.out.println("this is functional interface example"); a.disp;lay();  }
// lambda expression can be used only when there is one method in interface 
// lambda expression is known as anonymous function and it doesnt require class implementation and its work is to provide the implementation of method of interface




       B a = new B();     
        a.display();

    } 
    
}
