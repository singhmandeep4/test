package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String args[]){

        // Creating Deque
        Deque<String> city =new ArrayDeque<>();

        //Adding elements
        city.add("Chandigarh");
        city.add("Pune");
        city.add("Banglore");

        //Traverse elements
        for(String str:city){
            System.out.println(str);
        }


        System.out.println("--------Offer Traversal--------");
        city.offer("Mohali");
        city.offerFirst("UK");
        city.offerLast("CA");

        for(String str1:city){
            System.out.println(str1);
        }


        System.out.println("--------Poll Traversal--------");
        city.poll();
        city.pollLast();
        for(String str1:city){
            System.out.println(str1);
        }
    }
}
