import java.util.*;
public class Swapp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice a and b");
        char ch = sc.next().charAt(0);
        int a =2,b=5;
        
        if(ch=='a'){
            System.out.println("using two variable");
            a = a+b;
            b = a-b;
            a = a-b;
        }
        else if(ch=='b'){
            System.out.println("using 3 Variable");
            int temp = a;
            a=b;
            b=temp;
        }
        System.out.println(a + " and " + b);
    } 
}
