package Polymorphism;

public class MainOverloading {

    public static void main(String args[]){
        System.out.println("Main with String[]");
        MainOverloading.main("");
        MainOverloading.main();
    }
    public static void main(String args){
        System.out.println("Main with String");
    }
    public static void main(){
        System.out.println("Main without argument");
    }
}
