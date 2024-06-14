package PA_303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid = new KidUser();
        kid.setAge(10);
        kid.setBookType("Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println("+".repeat(15));

        KidUser falseKid = new KidUser();
        kid.setAge(18);
        kid.setBookType("Horror");
        kid.registerAccount();
        kid.requestBook();
    }
}
