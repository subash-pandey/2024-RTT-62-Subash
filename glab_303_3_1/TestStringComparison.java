package glab_303_3_1;


public class TestStringComparison {
    public static void main(String args[]){
        String s1="PerScholas";
        String s2="perScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}


