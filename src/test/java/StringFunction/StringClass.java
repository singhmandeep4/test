package StringFunction;

import java.util.Locale;

public class StringClass {

    public static void main(String args[]){

        String firstName="Shane";
        String lastName="Watson";
        System.out.println(firstName.concat(lastName));

        String str="Welcome to String class";
        System.out.println("Convert to uppercase : " + str.toUpperCase());
        System.out.println("Convert to uppercase : " + str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println("Convert to lowercase : " + str.toLowerCase());
        System.out.println("String length : " + str.length());
        System.out.println("Character at position : " + str.charAt(14));

        System.out.println("Replace string : " + str.replace("to", "TO"));
        System.out.println("Replace " + str.replace("class","methods"));
        System.out.println("Replace complete string : " + str.replaceAll(str,"Hello Java"));

        System.out.println("Substring : " + str.substring(3));
        System.out.println("Substring from particular index : " + str.substring(3,6));


        System.out.println("String ends with : " + str.endsWith("a")); //returns True or False
        System.out.println("String contains : " + str.contains("c")); //returns True or False

        System.out.println(String.format("String format : %s ", str )); //String value
        System.out.println(String.format("String format : %f ", 12.9956 )); //decimal number

        System.out.println(str.isEmpty());
        System.out.println(str.startsWith("Welcome"));
        System.out.println(str.startsWith("e",2));

        String str3=" Hello World ";
        System.out.println(str3);
        System.out.println(str3.trim());

    }
}
