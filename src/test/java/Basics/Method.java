package Basics;

public class Method {

    public static void checkNum(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    public static int add(int a,int b){

        int sum=a+b;
        return sum;
    }
    public int subtract(int a, int b){
        int sub=a-b;
        return sub;
    }

    public static void main(String args[])
    {
        int num=11;
        checkNum(num);

        int a=20, b=15;
        int c=add(a,b);
        System.out.println("Sum : " +c);

        Method obj=new Method();
     // obj.subtract(a,b);
        System.out.println("Subtraction value : " + obj.subtract(a,b));
    }
}
