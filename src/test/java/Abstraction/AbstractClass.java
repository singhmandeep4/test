//Abstract class that has an abstract method

package Abstraction;

abstract class RBI{
    abstract void getRateOfInterest();
}

class SBI extends RBI
{
    public void getRateOfInterest(){
        System.out.println("SBI rate of interest is : 7.5");
    }
}
class PNB extends RBI{
    public void getRateOfInterest(){
        System.out.println("PNB rate of interest is : 8");
    }
}
class AXIS extends RBI{
    public void getRateOfInterest(){
        System.out.println("AXIS rate of interest is : 7.25");
    }
}

public class AbstractClass {
    public static void main(String args[]){
        RBI interestRate=new SBI();
        interestRate.getRateOfInterest();
    }
}
