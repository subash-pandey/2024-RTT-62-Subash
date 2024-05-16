package GLAB_303_11_6;

import java.util.TreeMap;

public class TreeMapRemoveExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        int firstKey = treeMap.firstKey();
        System.out.println("The first key is " + firstKey);

        int lastKey = treeMap.lastKey();
        System.out.println("The last key is " + lastKey);

        System.out.println("The first entry is " + treeMap.firstEntry());
        System.out.println("The last entry is " + treeMap.lastEntry());

        System.out.println("TreeMap: " + treeMap);

        String value = treeMap.remove(1);
        System.out.println("Deleted TreeMap value: " + value);

        boolean removed = treeMap.remove(2,"Two");
        System.out.println("Is 2 = two removed : " + removed);
        System.out.println("TreeMap: " + treeMap);


    }
}
