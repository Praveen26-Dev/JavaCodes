public class FinallyExample{
    public static void main(String args[]){
        try{
         System.out.println("Inside try block");
         System.out.println(10/0);

        }
        catch(NullPointerException np){
            System.out.println("Inside catch block");
        }
        catch (Exception e){
            System.out.println("Inside 2nd catch block" + e.getMessage());

        }
        finally{
            System.out.println("Inside finally block");
        }

    }
}