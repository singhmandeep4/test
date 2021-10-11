package Polymorphism;


class Addition1{
    static String add(int a,String b){
        System.out.println("Int : String");
        return a + b;
    }
    static String add(String a, int b){
        System.out.println("String : Int");
        return a + b;
    }
}

public class MethodOverloading1 {

    public static void main(String args[]){

        System.out.println(Addition1.add(10,"ABC"));
        System.out.println(Addition1.add("XYZ",20));

    }
}
