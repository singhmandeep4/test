package Collection.List;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

    public static void main(String args[]){

        Stack<Integer> stk=new Stack();

        System.out.println(stk.empty());
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        System.out.println(stk);

        stk.pop();
        System.out.println(stk);

        System.out.println("Last value : " + stk.peek());
        System.out.println("Stack size : " + stk.size());
        System.out.println("Search item : " + stk.search(30));

        Iterator itr=stk.iterator();
        while (itr.hasNext()){
                 System.out.println("Print stack value through iterator : " + itr.next());
       }
    }

}
