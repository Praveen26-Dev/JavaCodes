import java.util.*;
public class LargestOfArray{
    public static void main(String args[]){
        int arr[]= {1,2,3,4,3,2,1};
        int largest =arr[0];
    //     int first=0;
    //     int second= 1;
    //         while(first<arr.length-1){
    //             if(arr[first]>largest){
    //                 largest=arr[first];
    //             } 
    //             if(arr[second]>largest){
    //                 largest=arr[first];
    //             }    
    //         first++;
    //         second++;
    //   }
    //   System.out.println(largest);
    // }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];

        }
    }
    System.out.println(largest);
}
}