import java.util.*;

class Student{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]";
    }
}
public class CompaRator {
    public static void main(String[] args){

        // Comparator is used to sort the elements of a collection based on some custom logic (how you wnat to do sorting is done by comparator)
        // Comparator<String> cmp = new Comparator<String>()
        // {
        //     public int compare(String s1, String s2)
        //     {
        //         if(s1.length() > s2.length())
        //             // this will sort the elements of a collection in ascending order based on their length
        //             return 1;
        //         else if(s1.length() < s2.length())
        //             // this else if 
        //             return -1; 
        //         else
        //             return 0;
        //     }      
        // };



        // List<String> ls = new ArrayList<>();
        // ls.add("non");
        // ls.add("noon");
        // ls.add("najn");
        // ls.add("njhuko");
// Collections.sort(ls); // sort is used to sort the elements of a collection in ascending order
// collections is used to sort the elements of a collection in ascending order



        // Comparator<Integer> cmp = new Comparator<Integer>(){
        //     public int compare(Integer i1, Integer i2){
        //         if(i1%10 > i2%10)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        // List<Integer> ls = new ArrayList<>();
        // ls.add(51);
        // ls.add(0);
        // ls.add(3);
        // ls.add(42);

        // Comparator<Student> cmp = new Comparator<Student>(){
        //     public int compare(Student s1, Student s2){
        //         if(s1.age > s2.age)
        //             return 1;
                
        //         else
        //             return -1;
        //     }
        // }; Now lets make it lambda expression because Comparator is a functional interface so we can use lambda expression to implement it

        Comparator<Student> cmp = (s1, s2) -> s1.age > s2.age ? 1 : -1;
        List<Student> ls = new ArrayList<Student>();
        ls.add(new Student(20, "John"));        
        ls.add(new Student(18, "Alice"));
        ls.add(new Student(22, "Bob"));


        
        
        Collections.sort(ls, cmp);
        for(Student s : ls){
            System.out.println(s);
        }
        
    }
    
}
