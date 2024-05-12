package GLAB_303_11_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> animals= new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Chicken");
        System.out.println(animals);
        System.out.println(animals.get(0));
        animals.add(2,"Elephant");
        System.out.println(animals);
    }

}
