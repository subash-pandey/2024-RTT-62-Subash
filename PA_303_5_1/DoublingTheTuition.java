package PA_303_5_1;

import java.util.Scanner;

public class DoublingTheTuition {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Please input your yearly tuition.");
        double tuition = sc.nextDouble();
        double originalTuition = tuition;
        for(int i = 1;i<50;i++){
            tuition =tuition+tuition*0.07;
            System.out.printf("The tuition fee is $%.2f in year %d.%n", tuition,i);
            if(tuition>=2*originalTuition){
                System.out.printf("The tuition doubles in %d years.%n", i);
                break;
            }
        }

    }
}
