package Collection.List;

import java.util.LinkedList;

public class Linked_List {

    public static void main(String args[]){

        LinkedList<String> name=new LinkedList<String>();
        name.add("John");
        name.add("Ron");
        name.add("Joe");
        name.add("Roy");
        name.add("Jessy");
        name.add("Joe");
        name.add("John");

        for (String str: name) {
            System.out.println(str);
        }

        name.add(2,"Mark");
        System.out.println("Latest list : " + name);
        name.addFirst("Thomas");
        System.out.println("Add at first position :" + name);

        name.addLast("Watson");
        System.out.println("Add at last position :" + name);

        name.removeFirst();
        System.out.println("Remove at first position :" + name);

        name.removeLast();
        System.out.println("Remove at last position :" + name);

        name.removeFirstOccurrence("Joe");
        System.out.println("List after removing first occurence :" + name);

        name.removeLastOccurrence("John");
        System.out.println("List after removing last occurence :" + name);

        System.out.println("List after removing particular name :" + name);

        name.removeAll(name);
        System.out.println("Remove All :" + name);


    }
}
