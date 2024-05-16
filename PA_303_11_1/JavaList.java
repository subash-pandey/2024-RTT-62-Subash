package PA_303_11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element");
            list.add(sc.nextInt());
        }
        for(Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Enter number of queries (only 2 as entries allowed");
        int queries = sc.nextInt();
        if(queries == 2) {
            System.out.println("Do you want to delete or insert");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("Insert")) {
                System.out.println("Enter the position to be entered");
                int pos = sc.nextInt();
                System.out.println("Enter the element to be entered");
                int element = sc.nextInt();
                list.add(pos, element);
            }else if(choice.equalsIgnoreCase("Delete")) {
                System.out.println("Enter the position to be deleted");
                int pos = sc.nextInt();
                list.remove(pos);
            }else{
                System.out.println("Wrong choice");
            }


        }else{
            System.out.println("Wrong choice");
        }
       for(Integer i : list) {
           System.out.print(i+" ");
       }
    }
}
