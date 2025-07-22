import java.util.*;
public class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int M = sc.nextInt();
        int H = sc.nextInt();
        double Percentage = ((E+M+H)/300.0)* 100;
        System.out.println("Your Percentage is == "+Percentage);
        System.out.println("Your Grade is ");
        if(Percentage>=10 && Percentage<40){
            System.out.println("Fail");
        }
        else if(Percentage>=40&&Percentage<60){
            System.out.println("C Grade");
        }
        else if(Percentage>=60&&Percentage<80){
            System.out.println("B Grade");
        }
        else if(Percentage>=80&&Percentage<=100){
            System.out.println("A grade");
        }
        else{
            System.out.println("Invalid");
        }
    } 
}
