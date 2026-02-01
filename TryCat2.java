public class TryCat2 {
    public static void main(String[] args) 
    {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try 
        {
            j = 0 / i;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurred: ");
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Always check limits");

        }
        catch (Exception e) 
        {
            System.out.println("Some Exception: " + e);
        }
        System.out.println("Exception handled successfully, j = " + j); 
    }
    
}
