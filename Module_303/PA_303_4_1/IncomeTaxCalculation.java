package PA_303_4_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IncomeTaxCalculation {
    public static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                Please input your category:
                1.Single
                2.Married and  filing jointly and qualified widow(er)
                3.Married but filing  separately.
                4.Head of the household.
                """);
        int choice=sc.nextInt();
        double tax = 0;
        double income = 0;
        switch(choice) {
            case 1:{
                income=annualIncome();
                if(income<=8350) {
                    tax= 0.1*income;
                } else if(income> 8350 && income<=33950) {
                    tax= 0.15*income;
                }else if(income> 33950 && income<=82950) {
                    tax= 0.25*income;
                }else if(income> 82950 && income<=171550) {
                    tax= 0.28*income;
                } else if(income> 171550 && income<=372950) {
                    tax= 0.30*income;
                } else{
                    tax= 0.35*income;
                }
                break;
            }
            case 2:{
                income=annualIncome();
                if(income<=16700) {
                    tax= 0.1*income;
                } else if(income> 16700 && income<=67900) {
                    tax= 0.15*income;
                }else if(income> 67900 && income<=137050) {
                    tax= 0.25*income;
                }else if(income> 137050 && income<=208850) {
                    tax= 0.28*income;
                } else if(income> 208850 && income<=372950) {
                    tax= 0.30*income;
                } else{
                    tax= 0.35*income;
                }
                break;
            }
            case 3:{
               income=annualIncome();
                if(income<=8350) {
                    tax= 0.1*income;
                } else if(income> 8350 && income<=33950) {
                    tax= 0.15*income;
                }else if(income> 33950 && income<=68525) {
                    tax= 0.25*income;
                }else if(income> 68525 && income<=104425) {
                    tax= 0.28*income;
                } else if(income> 104425 && income<=186475) {
                    tax= 0.30*income;
                } else{
                    tax= 0.35*income;
                }
                break;
            }
            case 4:{
                income=annualIncome();
                if(income<=11950) {
                    tax= 0.1*income;
                } else if(income> 11950 && income<=45500) {
                    tax= 0.15*income;
                }else if(income> 45500 && income<=117450) {
                    tax= 0.25*income;
                }else if(income> 117450 && income<=19020) {
                    tax= 0.28*income;
                } else if(income> 19020 && income<=372950) {
                    tax= 0.30*income;
                } else{
                    tax= 0.35*income;
                }
                break;
            }
            default:{
                System.out.println("Please input a valid choice");
            }
        }
        System.out.printf("For income $%.2f your annual income tax is $%.2f%n",income,tax);
    }
    public static double annualIncome(){
        System.out.println("Please input the annual income:");
        double annualIncome=sc.nextDouble();
        if(annualIncome<0){
            return 0;
        }
        return annualIncome;
    }
}
