package Basics;

public class DataType {

    public static void main(String args[]){

        //primitive data type

/*
        Boolean one = false;
        System.out.println(one);
        int a=10,b=20;
        System.out.println(a<b);

        char c='a';
        System.out.println("Char : " + c);

        byte b1=-128, b2=127;
        System.out.println("Byte : " + b1 + "\t\t" + b2);

        short s1= -32768, s2= 32767;
        System.out.println("Short : " + s1 + "\t\t" + s2);

        short  x=10;

        int i1=-2147483648, i2=2147483647;
        System.out.println("Integer: " + i1 + "\t\t" + i2);

        long l1= 200000L , l2= 100000L;
        System.out.println("Long: " + l1 + "\t\t" + l2);

        float f=15.7f;
        System.out.println("Float : " + f);

        double d=22.55;
        System.out.println("Double : " + d);
*/

        //Non-primitive data type
        String str="Hello World";
        System.out.println(str);

        char arr[]={'a','b','c'};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
