import java.util.Scanner;
public class Ternary{
    public static void main(String args[]){
        int number = 12;
        System.out.println((number>=10 && number<=20 && number%2==0 && number%3==0)?number:"Invalid");

    }
}