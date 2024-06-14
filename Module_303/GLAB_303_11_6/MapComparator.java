package GLAB_303_11_6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

class MapExample1{
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>(new MapComparator());
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        System.out.println("Map: "+map);
    }
}
