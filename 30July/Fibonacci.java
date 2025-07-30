import java.util.*;
public class Fibonacci{
    public static void main(String args[]){
        int first=0;
        int second=1;
        int nxt = 0;
        int pos = 5;
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<pos-2;i++){
           nxt = first + second;
           first = second;
           second = nxt;
           System.out.println(nxt);
        }
    }
}