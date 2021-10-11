package ExceptionHandling;

public class ExceptionHandlingExample {

    public static void main(String args[]){
    //    int a=100/0;

        try{
            int data=100/0;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }


        System.out.println("Test statement");
    }
}
