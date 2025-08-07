import java.util.*;
public class LargestOfArray{
    public static void main(String args[]){
        int arr[]= {1,2,3,4,3,2,1};
        int largest =Integer.MIN_VALUE;
        int i=0;
            while(i<arr.length-1){
                if(arr[i]>=arr[i++]){
                    largest=arr[i];
                }
            
      }
      System.out.println(largest);
    }
}