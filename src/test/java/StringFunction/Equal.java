package StringFunction;

public class Equal {

    public static void main(String args[]){

        String s1="Hello";
        String s2="Hello";
        String s3="HellO";
       /* if(s1.equals(s2))
        {
            System.out.println("String Matched");
        }
        if(s1.equalsIgnoreCase(s3))
        {
            System.out.println("String Matched in equal ignore case");
        }*/
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}
