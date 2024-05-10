package GLAB_303_10_1;

public class Girl extends Person {
    static double   ageFactor = 1.3;

    public  Girl(String name) {
       super("Ms. "+name);
    }

    @Override
    public String walk() {
        return (super.walk()+jump());
    }

    public String jump(){
        return " and I am now jumping";
    }


}
