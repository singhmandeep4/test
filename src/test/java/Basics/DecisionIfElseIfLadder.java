package Basics;

public class DecisionIfElseIfLadder {

    public static void main(String args[]){

        int marks=55;
        if(marks<0 || marks>100){
            System.out.println("Invalid marks.");
        }
        else if(marks<=50){
            System.out.println("D grade");
        }
        else if(marks>50 && marks<=60){
            System.out.println("C grade");
        }
        else if(marks>60 && marks<=70){
            System.out.println("B Grade");
        }
        else{
            System.out.println("A grade");
        }

        System.out.println("This is a test statement.");
    }

}
