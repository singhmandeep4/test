package AccessModifier;
import AccessModifier1.DefaultClass;

public class Default_AM {

    public static void main(String args[]){

        DefaultClass obj=new DefaultClass();
    //    obj.message1();   //outside the package
        obj.message2();     //outside the package

        TestClass obj1=new TestClass();
        obj1.message3();

    }
}
