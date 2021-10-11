package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]){

        TreeMap<Integer,String> map=new TreeMap<Integer, String>();
        map.put(4,"Chandigarh");
        map.put(2,"Pune");
        map.put(5,"Mumbai");
        map.put(1,"Indore");

        for(Map.Entry c: map.entrySet()){
            System.out.println(c.getKey() + " " + c.getValue());
        }

        map.remove(5);
        System.out.println("Key-Values : " + map);

        map.replace(2,"Kerala");
        System.out.println("Key-values : " + map);

        System.out.println("Descending Map :" + map.descendingMap());

        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("Head Map : " + map.headMap(2));

        ///Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("Tail Map : " + map.tailMap(2));

    }
}
