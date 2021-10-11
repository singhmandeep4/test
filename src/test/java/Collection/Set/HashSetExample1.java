package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

    public static void main(String args[]){

        //Contains only unique values
        HashSet<Integer> set=new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(null);

        Iterator itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        set.remove(null);
        System.out.println("Remove null value : " + set);

        System.out.println("Check contains : " + set.contains(10));
        set.clear();
        System.out.println("Values after cleared : " + set);

        //Operations on String values
        HashSet<String> city=new HashSet<String>();
        city.add("Chandigarh");
        city.add("Mohali");
        city.add("Panchkula");
        city.add("New Delhi");

        System.out.println("Values before remove : " + city);
        city.remove("Mohali");
        System.out.println("Values after remove : " + city);

        city.removeIf(str->str.contains("Chandigarh"));
        System.out.println("Remove through RemoveIf : " + city);

        System.out.println("Is collection empty ? - " + city.isEmpty());
        System.out.println("Size : " + city.size());

    }
}
