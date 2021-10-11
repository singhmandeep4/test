package Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

    public static void main(String args[]){

        Vector<Integer> vec=new Vector<>();
        vec.add(100);
        vec.add(200);
        vec.add(300);
        vec.add(400);
        vec.add(500);

        Iterator itr=vec.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
