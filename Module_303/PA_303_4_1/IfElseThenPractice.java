package PA_303_4_1;
/*
1. Write a program that declares 1 integer variable x, and then assigns 7 to it.
 Write an if statement to print out “Less than 10” if x is less than 10.
 Change x to equal 15, and notice the result (console should not display anything).

2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
 Write an if-else statement that prints out “Less than 10” if x is less than 10,
  and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.

3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
 Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
 “Between 10 and 20” if x is greater than 10 but less than 20,
  and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.

4. Write a program that declares 1 integer variable x,
 and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is
  less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20)
  . Change x to 5 and notice the result.
 */


public class IfElseThenPractice {
    public static void main(String[] args) {
        int x =25;
        if(x<10||x>20){
            System.out.println("Out of range");
        } else if (10<=x && x<=20) {
            System.out.println("In range");
        } else{
            System.out.println("Greater than 10");
        }

    }
}
