// Race Condition is a situation when thread share the same data and try to change it at the same time. 
// If the order of execution of threads is not controlled, then the final result can be unpredictable. This situation is called a race condition.
// We can avoid race condition by using synchronization and locks. 
// The synchronized keyword in java is used to control access to a method or a block of code by multiple threads.
// When a method is declared as synchronized, only one thread can access it at a time, preventing race conditions.
class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] a){
        Counter c = new Counter();
        Runnable r1 = () -> {
            for(int i =1; i<= 10000; i++){
                c.increment();
            }
        };
        Runnable r2 = () -> {
            for(int i =1; i<= 10000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread (r1);
        Thread t2 = new Thread (r2);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(c.count);

    }
    
}
