package PA_303_11_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number entries to be inserted: ");
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the phone: ");
             Long phone = sc.nextLong();
             sc.nextLine();
             map.put(name, phone);
        }

        System.out.println();
        System.out.println("Enter the name to know the phone number: ");
        String name = sc.nextLine();
        if (map.containsKey(name)) {
            System.out.println("The phone number is "+map.get(name));
        }else{
            System.out.println("Not found the phone number for "+name);
        }
    }
}
