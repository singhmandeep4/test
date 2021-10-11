package Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String args[]){

        PriorityQueue<String> city=new PriorityQueue<String>();
        city.add("Chandigarh");
        city.add("New Delhi");
        city.add("Pune");
        city.add("Banglore");
        city.add("Hyderabad");
        city.add("Mumbai");

        Iterator itr=city.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());

        }
/*
        //removes the head of this queue.
        System.out.println("-------Queue items after remove---------");

        city.remove();
        Iterator itr1=city.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }*/


        System.out.println("Element : " + city.element());
        System.out.println("Peek : " + city.peek());


    }
}
