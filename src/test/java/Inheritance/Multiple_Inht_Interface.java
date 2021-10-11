package Inheritance;

interface print{
    void message();
}
interface show{
    void message();
}

public class Multiple_Inht_Interface implements print,show {

    public void message(){
        System.out.println("Test Multiple Inheritance through interface");
    }
    public static void main(String args[]){

        Multiple_Inht_Interface obj=new Multiple_Inht_Interface();
        obj.message();
    }
}
