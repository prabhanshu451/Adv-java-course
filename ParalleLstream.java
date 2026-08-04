import java.util.*;
import java.util.stream.*;
public class ParalleLstream {
    // Parallel stream is a feature of Java 8 that allows us to process collections of data in parallel, using multiple threads. 
    // It is a way to improve the performance of our code by taking advantage of the available CPU cores.
    // Parallel stream is created by calling the parallelStream() method on a collection. It returns a stream that can be processed in parallel.
    // The elements of the stream are divided into multiple chunks, and each chunk is processed by a separate thread. 
    // The results of the processing are then combined to produce the final result.
    // Parallel stream is useful when we have a large collection of data that can be processed independently. 
    // It can be used with any collection that implements the Collection interface, such as List, Set, and Map. 
    // It can also be used with arrays and other data structures that can be converted to a stream.
    // Parallel stream is not always faster than sequential stream. 
    // It depends on the size of the collection, the complexity of the processing, and the number of available CPU cores. 
    // In some cases, parallel stream can be slower than sequential stream due to the overhead of managing multiple threads.
    //  Therefore, it is important to measure the performance of our code and choose the appropriate approach based on the specific use case.  

    public static void main(String[] a){
        int size = 10000;
        List<Integer> ls = new ArrayList<>(size);
        Random rn = new Random();
        for(int i = 1; i<= size; i++){
            ls.add(rn.nextInt(100));
        }

        long seqTime = System.currentTimeMillis();
        int s1= ls.stream()
                  .map(i -> i*2)
                  .reduce(0,(c,e) -> c+e);
        long endTime = System.currentTimeMillis();

        long startT = System.currentTimeMillis();
        int s2 = ls.stream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();  
        long endT = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int s3  = ls.parallelStream()
                    .map(i -> i*2)
                    .mapToInt(i -> i)
                    .sum();
        long endPara = System.currentTimeMillis();
        System.out.println(s1 + " " + s2 + " " + s3 );
        System.out.println("reduce: " + (endTime - seqTime));
        System.out.println("map to : " + (endT - startT));
        System.out.println("Para: " + (endPara - startPara));


    }
    
}
