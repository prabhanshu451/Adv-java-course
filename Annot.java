// this is about Annotations
// Annotation is a form of metadata that provides data about a program but is not part of the program itself.    @Deprecated,@Override,@SuppressWarnings
// Annotations have no direct effect on the operation of the code they annotate. 
// They can be used by the compiler for checking, by development tools for generating code or documentation, and at runtime for various purposes.
// Annotations can be applied to classes, methods, variables, parameters, and packages.
// Annotations can have elements (also known as members) that can be used to pass values to the annotation.
// Annotations can be retained at different levels: SOURCE (discarded by the compiler), CLASS (stored in the class file but not available at runtime), and RUNTIME (available at runtime via reflection).
// Custom annotations can be created using the @interface keyword.
class A {
    public void display() {
        System.out.println("Class A display method");
    }
}
class B extends A {
    @Override
    public void display() {
        System.out.println("Class B display method");
    }
}

public class Annot {
    public static void main(String[] args) {
        A obj = new B();
        obj.display(); // This will call the overridden method in class B
    }
}