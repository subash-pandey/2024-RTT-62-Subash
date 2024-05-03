package PA_303_2_3;

/*
Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
 Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1,
  and then print it again.
 */

public class IncrementByOne {
    public static void main(String[] args) {
        int x = 7;
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x+=1;
        System.out.println(x);

    }
}
