package Polymorphism;

class Addition{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(int a, double b){
        return a+b;
    }
}

public class MethodOverloading {

    public static void main(String args[]){

        System.out.println(Addition.add(10,20));
        System.out.println(Addition.add(10,20,30));
        System.out.println(Addition.add(10,12.5));

    }
}
