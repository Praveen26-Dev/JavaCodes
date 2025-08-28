import java.util.*;
public class Anagram{
    public static void main(String args[]){
        String str1="abcd";
        String str2="";
        if(str1.length()!=str2.length()){
            System.out.println("Not A Anagram");
            return;
        }
        int count[] = new int[256];
        for(int i=0;i<str1.length();i++){
         count[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
               System.out.println("Not A Anagram");
               return;
            }
        }
        System.out.println("Anagram");
    }
}