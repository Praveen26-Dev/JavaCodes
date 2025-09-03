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

// compile time polymorphism
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger Roars");
    }
}
 class Polymorphism{
    public static void main(String args[]){
    Animal obj = new Dog(); // yaha par maine reference Dog ka diya aur obj ka type Animal diya isiliye ye run time hai kunki "new" keyword yaha per batata hai ki kon reference ka method call kerna at run time
    obj.sound();

    Tiger t = new Tiger(); //yaha type aur reference dono Tiger class ka hai isiliye compiler ko compiler kerte waqt pata rehta hai ki kon sa method call kerna 
    t.sound();  
 }
}
