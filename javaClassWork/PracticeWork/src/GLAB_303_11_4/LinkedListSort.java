package GLAB_303_11_4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("E");
        list.add("C");
        list.add("Q");
        list.add("G");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);


    }
}
