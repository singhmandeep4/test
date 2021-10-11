package Encapsulation;

class Student{
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}

public class Encap {

    public static void main(String args[]){

        Student obj=new Student();
        obj.setName("Test User");
        System.out.println(obj.getName());
    }

}
