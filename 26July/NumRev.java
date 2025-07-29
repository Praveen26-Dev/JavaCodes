import java.util.*;
public class NumRev{
    public static void main(String ags[]){
        int n=512;
        int ans=n;
        while(n!=0){
        int digit = n%10;
        rev = rev*10+digit;
        n=n/10;
        }
        
        System.out.println(rev);
            }
}