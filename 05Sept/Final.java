final class Animal{
    final int j=12;
        final void sound(){
        System.out.println("Animal have sound");
    }
}

class Tiger extends Animal{
    // j=12;
    // System.out.println(j);
    void sound(){
        System.out.println("Tiger Sound Roar");
    }    
}


class Final{
    public static void main(String args[]){
        Tiger t = new Tiger();
        t.sound();
    }
}