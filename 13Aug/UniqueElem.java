        
import java.util.*;
public class UniqueElem{
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,1,2,3,0,2,6,0,7,9};
        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&arr[i]!=-1){
                    duplicate=true;
                    arr[j]=-1;
                }
            }
            if(!duplicate&&arr[i]!=-1){
                System.out.println(arr[i]+" ");
            }
        }

        
    }
}
