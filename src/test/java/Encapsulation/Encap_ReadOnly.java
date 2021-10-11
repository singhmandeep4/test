package Encapsulation;


class Student1{
    private String name="John";
    //getter method for name
    public String getName(){
        return name;
    }

}

public class Encap_ReadOnly {
    public static void main(String args[]){

        Student1 obj=new Student1();
        System.out.println(obj.getName());
    }
}
