package org.example;

public class FirstJavaClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte num;   // This can hold whole number between -128 and 127.
        num = 113;
        System.out.println(num);

        short snum;
        snum = 150;
        System.out.println(snum);

        int inum = 12;
        System.out.println(inum);
        Integer number =13;
        System.out.println(number);

        System.out.println("This prints\n quotes literally \" b \" ");
        System.out.println('\u00d1');



        long lnum = -12332252626L;
        System.out.println(lnum);

        double dnum = -42937737.9;
        System.out.println(dnum);

        float fnum = 19.98f;
        System.out.println(fnum);

        boolean b = false;
        System.out.println(b);

        char ch = 'Z';
        System.out.println(ch);
    }
}

