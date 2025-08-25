import java.util.*;
public class SubSequence{
    public static void main(String args[]){
    String str1="ABCD";
    String str2="BCE";
    int i=0;
    int j=0;
    while(i<str1.length()&&j<str2.length()){
        if(str1.charAt(i)==str2.charAt(j)){
            ++j;
        }
        ++i;
    }
    if(j==str2.length()){
        System.out.println("SubSequence True");
    }
    else{
        System.out.println("SubSequence False");
    }
}

}