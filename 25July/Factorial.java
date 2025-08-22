import java.util.*;
public class Factorial{
 public static void main(String args[]){
    int fact=1;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num<=1){
        System.out.println("factorial is "+num);
    }

    for(int i=1;i<=num;i++){
        fact = fact*i;
    }
    System.out.println(fact);
} 
}   