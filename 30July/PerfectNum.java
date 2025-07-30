import java.util.*;
public class PerfectNum{
    public static void main(String args[]){
        int n=6;
        int sum =0;
        for(int i=1;i<n-1;i++){
           if(n%i==0){
            sum=sum+i;
           }
        }
        if(sum==n){
            System.out.println("Perfect Num");
        }
        else{
            System.out.println("Not Perfect Num");
        }
    }
}