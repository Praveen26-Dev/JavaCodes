import java.util.*;
public class ReverseString{
    public static void main(String args[]){
        String str="Hello";
        char arr[]=str.toCharArray();
        int first=0;
        int last=arr.length-1;
        while(first<last){
          char temp = arr[first];
          arr[first] = arr[last];
          arr[last] = temp;
          first++;
          last--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}