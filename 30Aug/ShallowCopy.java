public class ShallowCopy{
 public static void main(String args[]){
    // Student s =new Student();
    // s.show();

    Student s1 = new Student("Raaju",23);
    s1.show();
    Student s2 = new Student(s1);
    s2.show();
    s1.age = 25;
    s1.name ="Pappu";
    
    s1.show();
    s2.show();
 }
}

class Student{
    String name;
    int age;
    // Student(){
    //     this.name = "Rahul";
    //     this.age = 20;
    //     }
    Student(String name,int age){
     this.name = name;
     this.age = age;
    }

    Student(Student obj){
     this.name = obj.name;
     this.age = obj.age;
    }
    void show(){
        System.out.println("Name is = "+ name+" and Your Age is = "+age);
    }

}