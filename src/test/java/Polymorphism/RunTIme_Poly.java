package Polymorphism;

class RBI{
    float getRateOfInterest(){
        return 0;
    }
}

class SBI1 extends RBI{
    float getRateOfInterest(){
        return 8.4f;
    }
}

class ICICI1 extends RBI{
    float getRateOfInterest(){
        return 7.3f;
    }
}

class RunTime_Poly{
    public static void main(String args[]){
        RBI b;
        b=new SBI1();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI1();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
    }
}
