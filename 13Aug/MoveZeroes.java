import java.util.*;
public class MoveZeroes{
    public static void main(String args[]){
        int arr[] = {0,1,0,2,0,0};
        int counter = 0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]!=0){
                arr[counter]=arr[i];
                ++counter;
            }
        }
        for(int i=counter;i<arr.length;i++){
            arr[i]=0;

        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}