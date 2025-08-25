import java.util.*;

class User {   // <-- public hata diya
    int x;
    int y;
    void input(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(this.x + " " + this.y);
    }
}

public class OOPS1 {   // <-- File ka naam Oops.java hona chahiye
    public static void main(String args[]){
        User s = new User();
        s.input(10,12);
    }
}
