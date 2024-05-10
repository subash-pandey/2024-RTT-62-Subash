public class SPAPractice {
    public static void main(String[] args) {
        String s ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for( int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        //Change to int (Integer);
        String s1 = "100";
        String s2 = "10";
        Integer i1 = Integer.valueOf(s1);
        Integer i2 = Integer.valueOf(s2);
        System.out.println(i1);
        System.out.println(i2);

        //sum of int Array
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int i:intArray){
            sum =sum+i;
        }
        System.out.println("The sum is of intArray "+sum);
        String[] s3 ={"1","2","3","4"};
        sum = 0;
        for(String s5: s3){
            Integer i3=Integer.valueOf(s5);
            sum =sum+i3;
        }
        System.out.println("The sum is of String array "+sum);
    }
    // String array to integer and then sum it



}

