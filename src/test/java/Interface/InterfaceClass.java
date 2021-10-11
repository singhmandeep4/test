package Interface;

interface Bank{
    void getRateOfInterest();
    default void msg(){
        System.out.println("Default");
    }
}

class SBI implements Bank{
    public void getRateOfInterest(){
        System.out.println("Rate of Interest is : 7.5");
    }
 }
class PNB implements Bank{
    public void getRateOfInterest(){
        System.out.println("Rate of interest is : 7.25");
    }
}
public class InterfaceClass {

    public static void main(String args[])
    {
        Bank obj=new SBI();
        obj.getRateOfInterest();
        obj.msg();
    }
}
