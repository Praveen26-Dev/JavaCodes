import java.util.*;
public class LCM{
    public static void main(String ags[]){
      Scanner sc = new Scanner(System.in);
      int n1 =sc.nextInt();
      int n2 =sc.nextInt();
        int max= (n1>n2)?n1:n2;
        while(true){
            if(max%n1==0&&max%n2==0){
                System.out.println(max);
                break;
         }
         max++;
        }
        // lcm++;
        // System.out.println(lcm);
    }
}