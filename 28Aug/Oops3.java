class One{
    int a=0;
}
class Two extends One{

}

class Three extends One{
    public static void main(String args[]){
    One t =new Two();
    System.out.println(t.a);
}
}

// inheritence
//   ---> single level
//   ---> multi level
//   ---> Hirarchical level
//   ---> file name - class name = not same (manually run the code)
//   ---> file name-- class name = can run automatically;
 