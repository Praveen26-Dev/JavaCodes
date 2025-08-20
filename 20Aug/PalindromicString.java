import java.util.*;
public class PalindromicString{
    public static void main(String args[]){
        String str = "mada";
        int last=str.length()-1;
        int first=0;
        boolean palin=true;
        while(first<=last){
            if(str.charAt(first)!=str.charAt(last)){
                palin = false;
                break;
            }
            first++;
            last--;
        }
        if(palin){
          System.out.println("Palindrome");
        }
        else{
          System.out.println("Not Palindrome");
        }
       
    }
}