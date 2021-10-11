package Basics;

public class DecisionNestedIf {

    public static void main(String args[]){

        int a=-10;

        if(a>0)
        {
            if(a/2==0)
            {
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is not even");
            }
        }
        else{
            System.out.println("Invalid number");
        }

        System.out.println("This is a test statement");
    }
}
