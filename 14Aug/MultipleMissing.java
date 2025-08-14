import java.util.*;
public class MultipleMissing{
    public static void main(String args[]){
        int arr[]={1,3,5,6,9};
        for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]-arr[i]>1){
            for(int j=arr[i]+1;j<arr[i+1];j++){
              System.out.println(j);
            }
        
           }
            
        }

    }
}
// remove fist occurannce of element in an array
// Remove all occurance of element  in an array
// find the target value in array