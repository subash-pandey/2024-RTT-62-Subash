package org.example;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World again";
        System.out.println("The length of the string is: " + str.length());

        str = str.toUpperCase();
        System.out.println("The uppercase string is: " + str);
        System.out.println("The substring for world is "+ str.substring(5,11));
        System.out.println("The substring for world is "+ str.substring(str.indexOf(' ')+1,str.lastIndexOf(' ')));
    }
}
