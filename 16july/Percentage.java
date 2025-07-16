import java.util.*;
public class Percentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of three subjects");
        int E =sc.nextInt();
        int H =sc.nextInt();
        int M =sc.nextInt();
        double Percentage = ((E+M+H)/300.0)* 100;
        System.out.println("Your Percentage is " + Percentage);
    }
}