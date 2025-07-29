import java.util.*;
public class Palindrome{
    public static void main(String ags[]){
        int n=121;
        int rev=0;
        int ans=n;
        while(n!=0){
        int digit = n%10;
        rev = rev*10+digit;
        n=n/10;
        }
        if(rev == ans){
            System.out.println("yes it is palindrome");
        }
        else System.out.println("Not a palindrome");
            }
}