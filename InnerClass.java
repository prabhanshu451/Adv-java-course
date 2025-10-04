class A
{
    int age;
    public void show()
    {
        System.out.println("show is going");
    }
    class B 
    // it is a non static inner class
    // if we make it static then we can access it without creating the object of A
    // but if it is non static then we have to create the object of A first
    {
        public void display()
        {
            System.out.println("display is going");
        }
    }
}



public class InnerClass {
    public static void main(String[] args)
    {
        A obj = new A();
        // show is a non static method of class A
        obj.show();
        // it will give the things which are in class A
        // when we try to access method display

        // it will give error
        // obj.display();
        // B obj2 = new B();
        // obj2.display();
    
        A.B obj2 = obj.new B();
        // here we are creating the object of B class
        // so now it is showing that B is a inner class of A and B belongs to A
        // so we have to create the object of A first and then we can create the object
        obj2.display();

        // if we have made the class B static then we can create the object of B without creating the object of A
        // A.B obj2 = new A.B(); and it will work 
    
    }
    
}
