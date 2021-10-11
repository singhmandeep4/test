// Abstract class which have abstract method and method body (non-abstract method),
package Abstraction;

abstract class Car{
   //Abstract method
    abstract void brand();
    abstract void color();

    //Non abstract method
    void gear(){
        System.out.println("Gear are standard.");
    }
}
class Honda extends Car{
    void brand(){
        System.out.println("Brand is Honda");
    }
    void color(){
        System.out.println("Available colors are Black, White");
    }
}

public class AbstractClass1 {

    public static void main(String args[]){
        Car obj=new Honda();
        obj.brand();
        obj.color();
        obj.gear();
    }
}
