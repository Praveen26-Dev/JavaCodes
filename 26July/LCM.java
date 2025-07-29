import java.util.*;
public class LCM{
    public static void main(String ags[]){
        int n1=9;
        int n2=7;
        int lcm=0;
        for(int i=n1;;i+=n1){
            if(i%n1==0&&i%n2==0){
                lcm =i;
                break;
            }
        }
        System.out.println(lcm);
    }
}