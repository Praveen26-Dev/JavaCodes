import java.util.*;
public class DivBy{
    public static void main(String  args[]){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
        System.out.println("Divisible by 3 and 5 ");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}