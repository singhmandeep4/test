package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]){
        TreeSet tree=new TreeSet();
        tree.add("Panchkula");
        tree.add("Mohali");
        tree.add("Chandigarh");

        Iterator itr=tree.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
