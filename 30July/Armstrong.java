import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        int n=153;
        int no = n;
        int sum =0;
        while(n!=0)
        {
            int digit = n%10;
            sum = digit*digit*digit;
            n = n/10;
        }
        if(sum==no){
            System.out.println("Yes,It is armstrong");
        }
        else{
            System.out.println("Not a armstrong");
        }
    }
}