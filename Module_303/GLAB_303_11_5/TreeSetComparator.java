package GLAB_303_11_5;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
          return o2.compareTo(o1);
    }
}

class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>(new TreeSetComparator()); {
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }


}
}