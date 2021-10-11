package Basics;

abstract class Test{
    abstract void display();
}

public class MethodAbstract extends Test {

    void display() {
        System.out.println("Abstract Method");
    }

    public static void main(String args[]){

        MethodAbstract obj=new MethodAbstract();
        obj.display();
    }

}
