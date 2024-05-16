package GLAB_303_11_7;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String,String> data;
    public PhoneDirectory() {
        this.data = new TreeMap<String,String>();
    }
    public void storeDetails(String name, String number) {
        if(name==null || number==null){
            throw new IllegalArgumentException("name and number must not be null");
        }
        data.put(name,number);
    }
    public String getDetails(String name){
        return data.get(name);
    }
    public void printDetails() {
        for(String name : data.keySet()){
            System.out.println(name+": "+data.get(name));
        }
    }

}

class Data{
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();
        System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
        System.out.println("adds several entries.  It then prints the contents of");
        System.out.println("directory and does a few lookups.");
        System.out.println();
        directory.storeDetails("Fred","555-1234");
        directory.storeDetails("Barney","555-2345");
        directory.storeDetails("Wilma","555-3456");
        directory.storeDetails("Wilma","555-3456");
        directory.storeDetails("Wilma","555-2563");


        System.out.println("Contents of directory:");

        System.out.println();
        directory.printDetails();

        System.out.println();
        System.out.println("Number for Fred is " + directory.getDetails("Fred"));
        System.out.println("Number for Wilma is " + directory.getDetails("Wilma"));
        System.out.println("Number for Tom is " + directory.getDetails("Tom"));
        System.out.println("Number for Tom is " + directory.getDetails("Alex"));
        // The output from the last line should be null.


    }

}
