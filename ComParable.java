import java.util.*;


// Comparable is used to sort the elements of a collection based on some natural order
// the method compareTo() is used to sort the elements of a collection based on some natural order
// it is done by implementing the Comparable interface and overriding the compareTo() method
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int compareTo(Student that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
   
    public String toString(){
        return "Student [ age = " + age + " , name = " + name + "]";
    }
}
public class ComParable {
    public static void main(String[] a){
        List<Student> ls = new ArrayList<>();   
        ls.add(new Student(20, "Prabhat")); 
        ls.add(new Student(19, "Rohit"));
        ls.add(new Student(21, "Rohit"));

        Collections.sort(ls);
        for(Student s : ls){
            System.out.println(s);
        }

    }
    
}
