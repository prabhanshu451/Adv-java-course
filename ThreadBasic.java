class Hi extends Thread
{
    public void run() {
        for(int i =1; i <= 10; i++) {
            System.out.println("Hi.......");

        }
    }
}
class Hello extends Thread
{
    // in every thread we have to override the run method and write the code which we want to execute in that thread
    // the run method is the entry point for the thread and is called when the thread is started
    public void run() {
        for(int i =1; i <= 10; i++) {
            System.out.println("Hello..");

        }
    }
}
public class ThreadBasic {
    //1.  threads are smallest unit of execution in a program and can run concurrently with other threads
    //2.  threads can be used to perform tasks in the background, such as handling user input, performing calculations,
    //  or managing network connections
    
    // 3. threads can be created and managed using the Thread class in Java, 
    // which provides methods for starting, pausing, and stopping threads
    // 4.threads are lightweight processes that can run concurrently within a program
    // 5.they allow for multitasking and can improve performance by utilizing multiple CPU cores
    // 6.threads can be created by extending the Thread class or implementing the Runnable interface
    public static void main(String[] args) 
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        // when we call the show method of the Hi class, it will execute the code in the show method and print "Hi......." 10 times
        // but in thread we want to execute the code in the show method concurrently with other threads, 
        // so we need to start the thread using the start() method
        obj2.start();


    }
}
