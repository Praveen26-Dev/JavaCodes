// accessing elements of array
import java.util.*;
public class Array2{
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        System.out.println(a[3]);
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
            // this above for loop create an exception known as arrayIndexofBound as we are accessing elemnts more than length 
        }
    }
}
