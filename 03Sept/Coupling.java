// just to override a method we need to create a function with body  so to avoid this problem java comes with interface
// loose coupling vs tight coupling
// ====================================

// Tight Coupling --->>
// a class is totally dependent on other class is tight coupling 

//Loose Coupling ---->>


class Developer{
    void BuildApp(){
      System.out.println("Coder Build the App");
      Laptop l = new Laptop();
      l.compileCode();

      DeskTop d = new DeskTop();
      d.compileCode();
    }
}

class Laptop {
    public void compileCode(){
        System.out.println("Code get Compiled with 5 error,");
    }
}

class DeskTop{
    void compileCode(){
        System.out.println("Code get Compiled with 5 error Faster,");
    }
}



public class Coupling{
    public static void main(String args[]){
     Developer d = new Developer();
     d.BuildApp();
    }
} 