package StringFunction;

public class Split {

    public static void main(String args[]){

        String str="Welcome to Java";

        String[] str1=   str.split(" ");
        for(String s: str1){
            System.out.println(s);
        }
    }
}
