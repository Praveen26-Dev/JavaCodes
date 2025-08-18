import java.util.*;
public class H2{
    public static void main(String args[]){
        int arr[] = {1,6,2,3,4,1,2,6,3,3,6,9};
        int first=0;
        for(int i=0;i<arr.length-1;i++){
                int j=i+1;
                if(arr[first]==arr[j]){
                    arr[i]=-1;
                }
            }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }    
        }

        
}

