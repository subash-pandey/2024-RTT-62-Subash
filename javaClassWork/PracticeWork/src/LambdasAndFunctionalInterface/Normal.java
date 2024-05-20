package LambdasAndFunctionalInterface;

public class Normal {

    Human james = new Human() {
        @Override
        public void say() {
            System.out.println(" I am james ");
        }
    };

    Human john = new Human() {
        @Override
        public void say() {
            System.out.println(" I am john ");
        }
    };

    }
