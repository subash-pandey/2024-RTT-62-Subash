package GLAB_303_10_1;

public class Person {
    String         name;
    static int     lifeSpan = 60;
    static double  ageFactor = 1.0;

    public Person() {
        name ="";
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Hi my name is %s.", name);
    }
    public String talk(){
       return ("I have nothing to talk");
    }
    public String walk(){
        return ("I am going to walk");
    }
    public static double lifeSpan() {
        return(lifeSpan * ageFactor);
    }

}
