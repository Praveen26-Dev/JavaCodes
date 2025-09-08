class Animal{
    public int a =2;
    public void show(){
        System.out.println(a);
    }
    Animal(){
        System.out.println("Animal  have sound");
    }
}

class Tiger extends Animal{
    // System.out.println(super.a);
    //     super.show();
    //     System.out.println("Tiger roars");
    Tiger(){
        System.out.println(super.a);
        super.show();
        System.out.println("Tiger roars");
    }
}

class Super{
    public static void main(String args[]){
        Tiger t = new Tiger();
    }
}