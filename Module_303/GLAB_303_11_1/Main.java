package GLAB_303_11_1;

public class Main {
    public static void main(String[] args) {
        DemoClass demo=new DemoClass();
        demo.genericMethod(25);
        demo.genericMethod("Subash");
        demo.genericMethod(23.45);

        GenericsMultipleDataType<String,Integer> demo2 = new GenericsMultipleDataType<>();
        demo2.setT("Subash");
        demo2.setE(10);
        System.out.println(demo2.getT());
        System.out.println(demo2.getE());

        GenericsMultipleDataType<String,String> demo3 = new GenericsMultipleDataType<>();
        demo3.setT("Subash");
        demo3.setE("Pandey");
        System.out.println(demo3.getT()+" "+demo3.getE());
    }
}
