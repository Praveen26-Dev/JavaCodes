import java.util.*;
public class P9{
    public static void main(String args[]){
        int n=0;
       
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=5;c++)
            {
            
             if(c<=r){
                System.out.print((char)(c+64));
             }
             else System.out.print(" ");
            }
            System.out.println();
        }
    }
}