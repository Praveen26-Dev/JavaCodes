import java.util.*;
     class Animal{
        int a=10;
        public void sound(){
            System.out.println("Every animal has sound");
        }
    }
     class Tiger extends Animal{
        public void sound(){
            System.out.println("Tiger Roars");
        }
    }
     class Dog extends Animal{
        public void sound(){
            System.out.println("Dog Barks");
        }
    }

public class Oops2{
     public static void main(String args[]){
        Tiger t = new Tiger();
        t.sound();
        System.out.println(t.a);
        Dog d =new Dog();
        d.sound();
    }
}


// if we create any class public inside the java file then it  is necassary to create a class with same name as it provided to class name
// public class ---> file name
// default classes --> no file name necassary

// if class name is same as file name then compiler, by defaults wants the main method in that same class and if the main method is not there than it gives error of main method not found 
// and if we want to run the code we manually run java code like
// javac Oops.java
// java Dog.java