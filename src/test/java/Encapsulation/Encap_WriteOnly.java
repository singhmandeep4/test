package Encapsulation;


class Student2{
    private String name ;
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
public class Encap_WriteOnly {

    public static void main(String args[]) {

        Student2 obj = new Student2();
        obj.setName("Smith");
   //     System.out.println(obj.getName());
    }
}
