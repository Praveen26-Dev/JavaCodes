// in shallow copy --> 
// 1. primitive case ==> copy by value(changes in one object does not reflect in other object)
// 2. non primitive case ==> copy by reference (due to referene sharing of objects, changes in one object reflects in another object)

class CopyCons{
    int a;
    String name[];
    
    CopyCons(int a,String name[]){
        this.a= a;
        this.name = new String[name.length];
        this.name[0] = name[0];
    }
    
    
    CopyCons(CopyCons obj){
        this.a = obj.a;
        this.name = new String[obj.name.length];
        this.name[0] = obj.name[0];
    }
    public static void main(String args[]){
        String arr[] = {"Rahul"};
        CopyCons obj1 = new CopyCons(11,arr);
        // System.out.println(obj1.a+" "+ obj1.name[0]);
        CopyCons obj2 = new CopyCons(obj1);
        System.out.println(obj2.a+" "+ obj2.name[0]);

        obj1.a=145;
        obj1.name[0] = "lallu";
        System.out.println(obj1.a+" "+ obj1.name[0]);

        System.out.println(obj2.a+" "+ obj2.name[0]);

    }
}