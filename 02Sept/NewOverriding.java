class Aeroplane{
    void takeOff(){
        System.out.println("Every Aeroplane takes off");
    }
     
    void fly(){
        System.out.println("Every Aeroplane Fly in air");
    } 
}

class CargoPlane extends Aeroplane{
    void takeOff(){
        System.out.println("Cargo Plane requires Large runway ");
    }
     
    void fly(){
        System.out.println("Cargo Plane Fly at lower height");
    } 
}

class PassengerPlane extends Aeroplane{
    void takeOff(){
        System.out.println("Passenger Plane requires medium runway ");
    }
     
    void fly(){
        System.out.println("Passenger Plane Fly at medium height");
    } 
}

class FighterPlane extends Aeroplane{
    void takeOff(){
        System.out.println("Fighter Plane requires small runway ");
    }
     
    void fly(){
        System.out.println("Fighter Plane Fly at larger height");
    } 
}

class Airport{
    public void show(Aeroplane obj){
        obj.takeOff();
        obj.fly();
    }
}

class NewOverriding{
    public static void main(String args[]){
        System.out.println("From compile Time");
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        System.out.println("=====================================");
        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        System.out.println("=====================================");

        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();

        System.out.println("=====================================");
        System.out.println("From Run Time");
        
        Airport a = new Airport();
        a.show(cp);
        System.out.println("=====================================");
        a.show(pp);
        System.out.println("=====================================");
        a.show(fp);


     }
}