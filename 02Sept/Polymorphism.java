// many forms 
// poly ,morphism


// run time polymorphism

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
    
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Sound");
     
    }
}
 class Polymorphism{
    public static void main(String args[]){
    Animal obj = new Dog();
    obj.sound();
 }
}
