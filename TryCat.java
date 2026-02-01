// this is for exceptional handling using try catch mehod
public class TryCat 
{
    public static void main(String[] args) 
    {
        int i = 2; 
        int j = 0;
        try
        {
            j = i / 0;

        }
        catch(Exception e)
        {
            System.out.println("something is wrong " + e);

        }
        System.out.println(j + " exception handled successfully");
    }
}