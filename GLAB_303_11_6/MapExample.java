package GLAB_303_11_6;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C#");
        map.put(4,"C++");
        map.put(5,"C");
        map.put(6,"JavaScript");
        System.out.println("Languages : " + map);
        map.remove(2);
        System.out.println("Updated Languages : " + map);
    }
}
