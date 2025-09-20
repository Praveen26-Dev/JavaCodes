class Person{
    String name;
    Person(){
        System.out.println("Parent class Non Parametrized Constructor");
        
    }
    Person(String n){
        this.name = n;
        System.out.println("Parent class Constructor");
        System.out.println("Name " + name);

    }
}

class Employee extends Person{
    int age;
    Employee(){
        super();
        this.age = 34;
        this.name = "Ram";
    }
     Employee(String name){
       super(name);
       this.name = "Raju";
       this.age = 21;
       System.out.println("Constructor in Employee");
     }
    
     void show(){
        System.out.println("Name " + name +" Age "+age);
     }
}

class Cons2{
    public static void main(String args[]){
        Employee e2 = new Employee();
        e2.show();
        Employee e1 = new Employee("Jhunnu");
        e1.show();
    }
}