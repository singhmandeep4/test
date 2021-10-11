package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

    public static void main(String args[]){

        //HashSet from another Collection
        ArrayList<String> arrList=new ArrayList<String>();

        arrList.add("Apple");
        arrList.add("Samsung");
        arrList.add("Blackberry");
        arrList.add("Lenovo");

        HashSet<String> setHash=new HashSet<>(arrList);
        setHash.add("Motorola");

        arrList.add("Redmi"); // it will not be printed because data is converted before it.

        Iterator itr=setHash.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Create cloned set
        HashSet<String> cloneCollection=new HashSet<>();
        cloneCollection= (HashSet<String>) setHash.clone();
        System.out.println("Values after cloning : " + cloneCollection);
    }
}
