package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String args[]){

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Chandigarh");
        map.put(2,"Panchkula");
        map.put(3,"Mohali");
        map.put(3,"Mohali"); //duplicate key and same value
        map.put(4,"Chandigarh"); //unique key and duplicate value

        //duplicate key and different value
        map.put(5,"New Delhi");
        map.put(5,"Pune");

        for(Map.Entry city: map.entrySet()){
            System.out.println(city.getKey() + " " + city.getValue());
        }

        System.out.println("--------Add new element and move previous to new collection---------");

        HashMap<Integer,String> map1=new HashMap<Integer, String>();
        map1.put(6, "Banglore");
        map1.putAll(map);
        for(Map.Entry city1 : map1.entrySet() ){
            System.out.println(city1.getKey() + " "+ city1.getValue());
        }

        System.out.println("------Remove element-----------");
        map.remove(4);
        map.remove(3, "Mohali");
        HashMap<Integer,String> map2=new HashMap<Integer,String>();
        map2.putAll(map);
        for(Map.Entry city2 : map2.entrySet()){
            System.out.println(city2.getKey() + " " + city2.getValue());
        }

        System.out.println("----------Replace-----------");

        map.replace(1,"Chd");
        map.replace(2,"Panchkula","PKL");
        map.replace(5,"Pun", "PN");

        HashMap<Integer,String> cityCode=new HashMap<Integer, String>();
        cityCode.putAll(map);
        for(Map.Entry c:cityCode.entrySet()){
            System.out.println(c.getKey() + " " + c.getValue());
        }

        System.out.println("Keys : " + cityCode.keySet());
        System.out.println("Values : " + cityCode.values());
        System.out.println("Key-values : " + cityCode.entrySet());
    }
}
