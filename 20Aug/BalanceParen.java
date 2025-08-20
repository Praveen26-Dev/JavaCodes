import java.util.*;
public class BalanceParen{
public static void main(String args[]){
    String str="[(})]";
    int sq=0;
    int cur=0;
    int cir=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='['){
        sq++;
      }
      else if(str.charAt(i)=='('){
        cir++;
      }
      else if(str.charAt(i)=='{'){
       cur++;
      }
      else if(str.charAt(i)==']'){
        sq--;
      }
      else if(str.charAt(i)==')'){
        cir--;
      }
      else if(str.charAt(i)=='}'){
        cur--;
      }
    } 
    if(sq==0&&cur==0&&cir==0){
        System.out.print("String is balance");
    }
    else{
        System.out.print("String is Not balance");
    }
}
}