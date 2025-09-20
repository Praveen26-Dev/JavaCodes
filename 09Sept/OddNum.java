class CheckException extends Exception{
    CheckException(String msg){
        super(msg);
    }
}

class Check{
    void checkOdd(int num){
        if(num%2==1){
            throw new CheckException("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
}

class OddNum{
    public static void main(String args[]){
        Check c = new Check();
        try{
            c.checkOdd(15);
        }
        catch(CheckException e){
            System.out.println(e);
        }
    }
}