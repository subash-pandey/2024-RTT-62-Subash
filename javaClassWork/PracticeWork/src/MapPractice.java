import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Red", 1);
        hashMap.put("Green", 2);
        hashMap.put("Blue", 3);
        hashMap.put("Yellow", 4);
        hashMap.put("Orange", 5);
        System.out.println("The original hash map is: "+hashMap);
        if (hashMap.containsKey("Green")) {
            System.out.println(hashMap.get("Green"));
        } else {
            System.out.println("No");
        }
        System.out.println(hashMap.containsKey("Cyan")?hashMap.get("Red"):"No");
        System.out.println(hashMap.containsValue(1)?"Yes":"No");
        Set set = hashMap.entrySet();
        System.out.println("Set values: "+set);

    }
}
