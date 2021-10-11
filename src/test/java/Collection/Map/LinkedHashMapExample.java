package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String args[]){

        LinkedHashMap<Integer,String> city=new LinkedHashMap<Integer, String>();

        city.put(2,"New Delhi");
        city.put(1, "Haryana");
        city.put(3,"Punjab");

        for(Map.Entry c : city.entrySet()){
            System.out.println(c.getKey() + " " + c.getValue());
        }

        System.out.println("Keys : " + city.keySet());
        System.out.println("Values : " + city.values());
        System.out.println("Key-values : " + city.entrySet());
    }
}
