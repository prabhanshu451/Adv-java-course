
    // here we defining the body of drive method
    // but for abstract class we don't define the body of abstract method
    // we just declare it and the body is provided by the subclass

// ************* if we try to create the object of abstract class it will throw an error ************
// ************* because abstract class cannot be instantiated ************
// class car{
//     public void drive()
//     {

//     }
//     public void playMusic()
//     {
//         System.out.println("playing music");
//     }
// }
// public class AbstractKeyword 
// {
//     public static void main(String[] args)
//     {
//         car obj = new car();
//         obj.drive();
//         obj.playMusic();
//     }
    
// }
// Abstract Keyword is used for defining abstract classes and methods in Java.
// An abstract class cannot be instantiated and may contain abstract methods that must be implemented by subclasses.
// Example:
abstract class Car{
    abstract void drive();
    public void playMusic()
    {
        System.out.println("playoing music");
    }
}
class RollsRoyce extends Car
{
    public void drive()
    {
        System.out.println("Driving a Car");
    }
}
public class AbstractKeyword
{
    public static void main(String[] args)
    {
        //  we can not create object of abstract class
        // Car obj = new Car;
        // we have to create object of subclass
        Car obj = new RollsRoyce();
        obj.drive();
        obj.playMusic();


    }

}