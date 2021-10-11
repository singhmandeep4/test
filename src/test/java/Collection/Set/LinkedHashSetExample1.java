package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {

    public static void main(String args[]){

        LinkedHashSet<String> city=new LinkedHashSet<>();

        city.add("Chandigarh");
        city.add("Mohali");
        city.add("Panchkula");

        Iterator itr=city.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
