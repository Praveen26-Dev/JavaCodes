import java.util.*;
public class Frequency{
    public static void main(String args[]){
        int arr[]={1,2,3,2,4,3,4,4,3,2,2};
        for(int i=0;i<arr.length;i++){

            int count=1;
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&arr[i]!=-1){
                    duplicate=true;
                    ++count;
                    arr[j]=-1;
                }
            }
             if(arr[i]!=-1){
                System.out.println(arr[i]+" comes "+count+" times");
            }
        }

    }
}