package StringFunction;

public class ValueOf {

    public static void main(String args[])
    {
        int value=30;
        String str=String.valueOf(value);
        System.out.println(str);

        char ch1 = 'A';
        String s1 = String.valueOf(ch1);
        System.out.println(s1);

        float f  = 10.05f;
        String s2 = String.valueOf(f);
        System.out.println(s2);

        double d = 10.02;
        String s3 = String.valueOf(d);
        System.out.println(s3);
    }

}
