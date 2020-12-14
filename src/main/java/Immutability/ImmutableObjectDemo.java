package Immutability;

public class ImmutableObjectDemo {
    public static void main(String[] args) {
        Age age = new Age();
        age.setYear(30);
        Student s1 = new Student(1, "s1", age);
        System.out.println("before mod student one info: " + s1.getStudentAge().getYear());
        age.setYear(32);
        System.out.println("after mod student one info: " + s1.getStudentAge().getYear());

        Student s2 = new Student(2, "s2", age);
        s2 = s1;
    }
}

/*
How to make a class immutable
- Make the class final and that makes class cannot be subclassed.
- Make all fields private
- Don't provide setter methods for variables
- Make all mutable fields final. Reason is its values can be assigned only once.
- initialize all the fields through the constructor performing deep copy
- perform cloning of objects in the getter methods
 */