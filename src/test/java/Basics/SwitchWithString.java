package Basics;

public class SwitchWithString {

    public static void main(String args[]){

        String day="Friday";

        switch (day){

            case "Monday":
                System.out.println("It's Monday");
            case "Tuesday":
                System.out.println("It's Tuesday");
            case "Wednesday":
                System.out.println("It's Wednesday");
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");

            case "Saturday":
                System.out.println("it's Saturday");

            case "Sunday":
                System.out.println("It's Sunday");


            default:
                System.out.println("Invalid day");
        }
    }
}
