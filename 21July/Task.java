import java.util.*;

public class Task{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int no = sc.nextInt();
     int m1=30;
     int m2=31;

    if(no==1||no==3||no==5||no==7||no==8||no==10||no==12){
        System.out.println("31 days");
    }
    else if(no==2){
        System.out.println("28/29 days");
    }
    else if(no==4||no==6||no==9||no==11){
        System.out.println("30 days");
    }
    else{
        System.out.println("wrong month");
    }
    }
}