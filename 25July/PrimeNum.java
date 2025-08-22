public class PrimeNum{
    public static void main(String args[]){
        int no=20;
        int count=0;
        for(int i=1;i<=20;++i){
            if(no%i==0){
                ++count;
                // System.out.println(i);
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else System.out.println("Not a Prime number");
    }
}