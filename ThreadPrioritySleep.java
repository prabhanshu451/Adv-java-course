class Hii extends Thread {
    public void run() 
    {
        for(int i =1; i <= 100; i++){

        
        System.out.println("Hi");
        try { Thread.sleep(10); // it will make the thread sleep for 10 milliseconds and it will not execute any code during that time and it will be in waiting state and after
        //  10 milliseconds it will be in ready state and it will be executed by the CPU
    
            
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
       
    }}
}
class Hell extends Thread {
    public void run() 
    {
        for(int i =1; i <= 100; i++)
            {
                 System.out.println("Hello");
                try {
                       Thread.sleep(10);
                    } catch (Exception e) {e.printStackTrace();}
       
            }
    }
}
public class ThreadPrioritySleep {
    public static void main(String[] args) 
    {
        Hii obj1 = new Hii();
        Hell obj2 = new Hell();
        // thread priority is to make sure that which thread will execute first
        // syntax to set priority is threadname.setPriority(priorityvalue); and priority value is an integer value which is used to set the priority of the thread
        // and syntax to get priority is threadname.getPriority(); and it will return the priority of the thread
        // it ranges from 1 to 10 and default is 5 and also as Min_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10
        obj2.setPriority(Thread.MAX_PRIORITY -1);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();}
        obj2.start();

    
}
}
