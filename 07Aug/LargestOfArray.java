import java.util.*;
public class LargestOfArray{
    public static void main(String args[]){
        int arr[]= {1,2,3,4,3,2,1};
        int largest =Integer.MIN_VALUE;
        
        int first=0;
        int second= 1;
            while(first<arr.length-1){
                if(arr[first]>largest){
                    largest=arr[first];
                } 
                if(arr[second]>largest){
                    largest=arr[first];
                }    
            first++;
            second++;
      }
      System.out.println(largest);
    }
}