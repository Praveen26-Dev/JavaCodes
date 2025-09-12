// accessing elements of array

import java.util.*;
public class RevOfElem{
    public static void main(String args[]){
        int a[] = {1,2,3,31,76,90};
        int first=0,last=a.length-1;
        while(first<last);
        {
          int temp = a[last];
          a[last] = a[first];
          a[first] = temp;
          first++;
          last--;

           
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}