public class ThreadVsRunnable {
    public static void main(String[] args) {
        // Runnable is a functional interface that can be implemented using a lambda expression
        // here we create a Runnable that prints "Hello from Runnable!" to the console with all sleep time 
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++){
            System.out.println("HI...");
            try{ Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace(); }
        }
    };
    // Thread is a class that can be extended to create a new thread of execution
    Runnable obj2 = () -> {
        for (int i = 1; i <=5; i++){
            System.out.println("Hello...");
            try{ Thread.sleep(10);} catch (InterruptedException e) { e.printStackTrace(); }
        }

    };
    Thread t1 = new Thread(obj1);
    // this is how we create a new thread of execution using the Thread class and pass the Runnable object to it
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();
    }
    
}
