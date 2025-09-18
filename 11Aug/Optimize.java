import java.util.*; 
class Optimize{
    public static void main(String args[]){
       int arr[] = {1,3,6,2,4,5,8,9};
       int n=4;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       }
        System.out.print(arr[n-1]+" ");
    }
}