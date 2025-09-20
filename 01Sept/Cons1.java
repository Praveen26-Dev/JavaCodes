class Student{
    String name;
    int age;
    Student(){
        this("Rahul",32);
    }
    Student(String name,int a){
        this.name = name;
        this.age = a;
    }
    void show(){
        System.out.println("Your name is = \n"+name+"\nyour age is = \n"+age);
    }
}

class Cons1{
    public static void main(String args[]){
      Student s = new Student();
      s.show();
    }
}