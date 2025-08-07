import java.util.*;
public class PelindOfNum{
    public static void main(String args[]){
        int arr[]= {1,2,3,4,2,2,1};
        int first = 0;
        int last = arr.length-1;
        boolean palin = true;

        while(first<=last){
            if(arr[first]!=arr[last]){
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