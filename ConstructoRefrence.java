import java.util.*;
import java.util.stream.*;

class Stud{
    private String name;
    private int age;

    public Stud(){

    }

    public Stud(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class ConstructoRefrence {
    public static void main(String[] args){
        // Constructor reference is used to refer to a constructor without executing it.
        // It is a special type of method reference that allows us to create objects using the new keyword in a more concise way.
        // It is used to create objects of a class without explicitly calling the constructor. 
        // It is used to create objects of a class that has a constructor with parameters. 
        // It is used to create objects of a class that has a constructor with no parameters. 
        // It is used to create objects of a class that has a constructor with multiple parameters. 
        // It is used to create objects of a class that has a constructor with variable arguments. 
        // It is used to create objects of a class that has a constructor with generic types. 
        // It is used to create objects of a class that has a constructor with inner classes. 
        // It is used to create objects of a class that has a constructor with anonymous classes. 
        // It is used to create objects of a class that has a constructor with lambda expressions. 
        // It is used to create objects of a class that has a constructor with method references. 
        // It is used to create objects of a class that has a constructor with streams. 
        // It is used to create objects of a class that has a constructor with collections. 
        // It is used to create objects of a class that has a constructor with arrays. 
        // It is used to create objects of a class that has a constructor with enums.
        // It is used to create objects of a class that has a constructor with annotations. 
        // It is used to create objects of a class that has a constructor with reflection. 
        // It is used to create objects of a class that has a constructor with serialization. 
        // It is used to create objects of a class that has a constructor with deserialization. 
        // It is used to create objects of a class that has a constructor with multithreading. 
        // It is used to create objects of a class that has a constructor with synchronization. 
        // It is used to create objects of a class that has a constructor with deadlock. 
        // It is used to create objects of a class that has a constructor with thread pool. 
        // It is used to create objects of a class that has a constructor with executor service. 
        // It is used to create objects of a class that has a constructor with callable and future.
        // It is used to create objects of a class that has a constructor with lambda expressions. 

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        List<Stud> students =  new ArrayList<>();
        // for(String name : names){
        //     students.add(new Stud(name));
        // }

        students = names.stream()
                        // .map(name -> new Stud(name))  
                        // map is used to transform the elements of a stream from one type to another. In this case, we are transforming a stream of strings (names) into a stream of Stud objects by using the constructor reference Stud::new.
                        // when we use constructor reference we can replace the above line with the below line
                        .map(Stud::new)
                        // in this we have done by passing new operator and for which this operator is used to create a new object.

                        .toList();
        System.out.println(students);

    }
    
}
