package Inheritance;

class A{
    void message(){
        System.out.println("A: test message");
    }
}
class B{
    void message(){
        System.out.println("B: test message");
    }
}/*
class C extends A,B{
    void message(){
        System.out.println("C: test message");
    }
}*/


public class Multiple_Inht {

    public static void main(String args[])
    {
        A obj=new A();
        obj.message();
    }

}
