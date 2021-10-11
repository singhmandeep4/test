package Basics;

public class DecisionIfElse {

    public static void main(String args[]){

        int a=20,b=21;
/*

        if(a>b){
            System.out.println("A is greater than B");
        }
        else{
            System.out.println("A is less than B");
        }
*/

        System.out.println("This is a test statement");

        //Using Ternary Operator
        String number=(a>b) ? "A is greater than B" : "A is less than B";
        System.out.println(number);




    }
}
