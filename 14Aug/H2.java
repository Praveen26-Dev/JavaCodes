import java.util.*;
public class H2{
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,1,2,3,0,2,3,6,0,7,2,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+" ");
            }
        }     
    }
}
