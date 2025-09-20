class ArithException extends RuntimeException
{
    ArithException(String msg){
        super(msg);
    }
}


class UseOfThrow{

    void Ae(int a,int b)throws Exception{
        if(b==0){
            throw new ArithException("Divide by zero is not possible");
        }
        else{
            System.out.println(a/b);
        }
    }
    public static void main(String args[]){
        UseOfThrow obj = new UseOfThrow();
        try{  
             obj.Ae(100,0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}