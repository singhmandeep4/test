package AccessModifier;

class A{
    private int num=10;
    int var=20;

    private void message(){
        System.out.println("Private Access Modifier");
    }
}

public class Private_AM {

    public static void main(String args[]){

        A obj=new A();
        /*obj.message(); //compile time error
        System.out.println(obj.num); // compile time error
        */
        System.out.println(obj.var);
    }
}
