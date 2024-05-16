package GLAB_303_11_5;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("evenNumbers: " + evenNumbers);
        HashSet<Integer>numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.addAll(evenNumbers);//Union
        numbers.removeAll(evenNumbers);//Difference
        System.out.println("numbers: " + numbers);

    }
}
