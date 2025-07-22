import java.util.*;
public class Meter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int reading = sc.nextInt();
        int totalBill = 0;
        if(reading>0&&reading<=50){
            totalBill = reading*10;
            System.out.println("Your reading is "+reading+" and bill is "+totalBill);
        }
        else if(reading>50&&reading<100){
            totalBill = 50*10+(reading-50)*20;
            System.out.println("Your reading is "+reading+" and bill is "+totalBill);
            
        }
        else if(reading>100&&reading<=150){
            totalBill = 50*10+50*20+(reading-100)*30;
            System.out.println("Your reading is "+reading+" and bill is "+totalBill);
        }
        else if(reading>150&&reading<=200){
            totalBill=50*10+50*20+50*30+(reading-150)*40;
            System.out.println("Your reading is "+reading+" and bill is "+totalBill);
        }

        else if(reading>200){
            totalBill=50*10+50*20+50*30+50*40+(reading-200)*50;
            System.out.println("Your reading is "+reading+" and bill is "+totalBill);
        }
        else{
            System.out.println("Invalid");
        }
    } 
}
