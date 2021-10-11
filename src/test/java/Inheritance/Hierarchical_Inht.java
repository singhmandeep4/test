package Inheritance;

class Car{
    void carSuperClass(){
        System.out.println("Super class of Cars");
    }
}

class Honda extends Car{
    void hondaBrand(){
        System.out.println("Honda cars");
    }
}
class Maruti extends Car{
    void marutiBrand(){
        System.out.println("Maruti cars");
    }
}

public class Hierarchical_Inht {

    public static void main(String args[]){

        Maruti swift=new Maruti();
        swift.carSuperClass();
        swift.marutiBrand();
        //  swift.hondaBrand();
  }
}
