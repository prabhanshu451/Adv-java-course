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
