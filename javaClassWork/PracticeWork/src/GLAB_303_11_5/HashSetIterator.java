package GLAB_303_11_5;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetIterator {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        int first = numbers.first();
        System.out.println("first: " + first);
        int last = numbers.last();
        System.out.println("last: " + last);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(";");

        }
        System.out.println();
        boolean value = numbers.remove(10);
        System.out.println("Is 10 deleted? "+value);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all the elements removed? "+value2);



    }


}
