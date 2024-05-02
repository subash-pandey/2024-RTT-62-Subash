package org.example;

public class HomeWork5_1 {
    public static void main(String[] args) {
       /*
       Write a program that declares two integer variables,
        assigns an integer to each, and adds them together.
        Assign the sum to a variable. Print out the result.
       */
      int aNum = 10;
      int bNum = 20;
      int iSum = aNum + bNum;
      System.out.printf("Sum of %d and %d is %d\n", aNum, bNum, iSum);

      /*
      Write a program that declares two double variables,
       assigns a number to each, and adds them together.
       Assign the sum to a variable. Print out the result.
       */

      double cNum = 2.5;
      double dNum = 3.5;
      double dSum = cNum + dNum;
      System.out.printf("Sum of %f and %f is %f\n", cNum, dNum, dSum);
     /*
     Write a program that declares an integer variable and a double variable,
     assigns numbers to each, and adds them together. Assign the sum to a variable.
      Print out the result. What variable type must the sum be?
      */
      double eSum= cNum+bNum;
      System.out.printf("Sum of %f and %d is %f\n", cNum, bNum, eSum);

      // The variable type needs to be double as the result will have decimal point.

      /*
      Write a program that declares two integer variables,
       assigns an integer to each,
       and divides the larger number by the smaller number.
       Assign the result to a variable.
       Print out the result. Now change the larger number to a decimal.
        What happens? What corrections are needed?
        //The variable type needs to be changed into double.
       */

      int divResult = bNum/aNum;
      System.out.printf("The division result of %d and %d is %d\n", bNum, aNum, divResult);
      double divResult1= bNum/cNum;
      System.out.printf("The division result of %d and %.2f is %.2f\n", bNum, cNum, divResult1);

      /*
      Write a program that declares two double variables, assigns a number to each,
       and divides the larger by the smaller number.
       Assign the result to a variable.
       Print out the result. Now, cast the result to an integer.
        Print out the result again.
       */


      double fNum  =2.3;
      double divResult2= bNum/fNum;
      System.out.printf("The division result of %d and %.2f is %.2f\n", bNum, cNum, divResult2);
      int castResult = (int) divResult2;
      System.out.printf("The integer cast of the result is %d\n ",castResult);

      /*
      Write a program that declares two integer variables, x and y,
       and assigns the number 5 to x and the number 6 to y.
       Declare a variable q and assign y/x to it and print q.
       Now, cast y to a double and assign it to q. Print q again.
       */

      int x = 5;
      int y =6;
      double q = y/x;
      System.out.println("Value of q is "+q);
      q= ((double) y)/x;
      System.out.println("Value of q after casting y as double is "+q);

      /*
      Write a program that declares a named constant and uses it in a calculation.
       Print the result.
       */
        final double PI=3.14;
        double radius = 5.0;
        double area = PI*radius*radius;
        System.out.println("Area of  circle of radius "+ radius +"m is "+area+" square-m");

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale
        and complete an “order” for three items of the first product,
        four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         */

      double coffeePrice = 2.3;
      double espressoPrice = 3.5;
      double greenTeaPrice = 4.0;

      double subTotal = 3*coffeePrice+4*espressoPrice+2*greenTeaPrice;
      final double SALES_TAX = 0.0825;
      double totalSales=(1+SALES_TAX)*subTotal;
      System.out.printf("Subtotal= %.2f\n",subTotal);
      System.out.printf("The total sales = %.2f\n", totalSales);
    }

}
