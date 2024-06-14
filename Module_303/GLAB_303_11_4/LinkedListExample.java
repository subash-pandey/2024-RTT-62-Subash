package GLAB_303_11_4;


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        /*add(String Element) is used for adding
         * the elements to the linked list*/
        list.add("Item1");
        list.add("Item5");
        list.add("Item3");
        list.add("Item6");
        list.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + list);

        /*Add First and Last Element*/
        list.addFirst("First Item");
        list.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + list);

        /*This is how to get and set Values*/
        Object firstvar = list.get(0);
        System.out.println("First element: " + firstvar);
        list.set(0, "Changed first item");
        Object firstvar2 = list.get(0);
        System.out.println("First element after update by set method: " + firstvar2);

        /*Remove first and last element*/
        list.removeFirst();
        list.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + list);

        /* Add to a Position and remove from a position*/
        list.add(0, "Newly added item");
        list.remove(2);
        System.out.println("Final Content: " + list);
    }


}


