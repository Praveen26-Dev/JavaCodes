import java.util.*;
public class SecondLargest{
    public static void main(String args[]){
        int arr[]= {1,4,3,2,1};
        int smax=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            
                if(arr[i]>max){
                    max=arr[i];
            
        }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax&&arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
 }
}