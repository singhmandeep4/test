//A class implements an interface, but one interface extends another interface.

package Interface;

interface Printable{
    void print();


}
interface Showable extends Printable {
    void show();
}

class TestInterface implements Showable{
    public void print(){
        System.out.println("Print method");
    }
    public void show(){
        System.out.println("Show Method");
    }
}
public class InterfaceClass1 {

    public static void main(String args[]){
        TestInterface obj=new TestInterface();
        obj.print();
        obj.show();


    }
}
