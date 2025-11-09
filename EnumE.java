// Enum  are named constants (Enumerations) that can be used to define a set of predefined values.



enum Status 
{
    NEW, IN_PROGRESS, COMPLETED, CLosed;
}

public class EnumE 
{
    public static void main(String[] args) {
        Status s = Status.COMPLETED;
        // System.out.println(s.getClass().getSuperclass());  we can see that enum is subclass of java.lang.Enum class
        // Status[] ss = Status.values();


// every time when you itrate it gives status. so, this array is of type Status s (this is for enhanced for loop)
        // for (Status s : ss) 
        // {
        //     System.out.println(s);
        // }


        // // for printing the order of status we use ordinal() method
        // for (Status s : ss) 
        // {
        //     System.out.println(s + " at index " + s.ordinal());
        // }



        //  if we work with specific status then we use valueOf() method
        // Status s1 = Status.valueOf("IN_PROGRESS");

        // now we work with if-else condition for specific status
        // if(s == Status.NEW) 
        // {
        //     System.out.println("New task added");
        // }
        // else if(s == Status.COMPLETED) 
        // {
        //     System.out.println("Task completed");
        // }
        // else if(s == Status.IN_PROGRESS) 
        // {
        //     System.out.println("Task is in progress");

        // }
        // else 
        // {
        //     System.out.println("Done");
        // }


        // // when we use switch case with enum we can directly use the enum values without class name
        // switch(s)
        // {
        //     case NEW:
        //     System.out.println("New task added");
        //     break;
        //     case IN_PROGRESS:
        //     System.out.println("Task is in progress");
        //     break;
        //     case COMPLETED:
        //     System.out.println("Task completed");
        //     break;
        //     default: 
        //     System.out.println("Done");
        //     break;
        // }
    }
}
