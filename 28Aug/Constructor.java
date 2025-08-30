// Contructor --> to initialize variable of class by their default values
//            --> it is special type of function because it does not have return type 
//            --> it have same as of class name
//            --> it is default available by compiler
//            --> automatically called by  compiler when the object is created of that class 
// Copy Constructor
import java.util.*;
public class Constructor{
    public static void main(String args[]){
    Student s = new Student();
    Student s1 = new Student(s);
    // s.roll = 105;
    System.out.println(s1.roll);
    }
}

class Student{
    int roll;
    Student(){
        this.roll = 103;
        System.out.println("Parametrized --> Your Name is Rahul and roll no "+roll);
    }
    Student(Student obj){
        this.roll = obj.roll;
         System.out.println("Copy Contructor --> Your Name is Raj and roll no "+roll);
    }
    // Student(){
    //     this.roll = 101;
    //     System.out.println("Default --> Your name is Rakhi and Roll no is "+roll);
    // }
}
