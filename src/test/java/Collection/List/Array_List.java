package Collection.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {

    public static void main(String args[]){

        ArrayList<String> name=new ArrayList<String>();

        name.add(0,"Smith");
        name.add(1,"Jessy");
        name.add("Paul");
        name.add("Jack");


        System.out.println(name);
        System.out.println("Array size: " + name.size());

        System.out.println("Traversing list through Iterator : ");
        Iterator itr=name.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing list through For each : ");
        for (String value: name) {
            System.out.println(value);
        }

        System.out.println("Get and Set ArrayList: ");

        System.out.println("Array list before set : " + name);
        System.out.println("Value at index 2 : " + name.get(2));
        name.set(2,"Rajesh");
        System.out.println("Value at index 2 after set : " + name.get(2));
        System.out.println("Array list after set : " + name);

        Collections.sort(name);
        System.out.println("Name after sorting : " + name );

        name.remove(3);
        System.out.println("Array list after removing element : " +name);

    }
}
