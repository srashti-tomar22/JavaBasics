package Basics;

public class Basics {
    static int size = 0;

    public static void main(String[] args) {

        //   Print reverse array
        int[] arr1 = {1, 56, 78, 65, 41, -63};
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }

        //1026 => 9
        //  sum of given digits
        int num = 10234;
        int sum = 0;
        while(num !=0){
            int digit = num %  10;
            sum = sum +digit;
            num = num/10;
        }


        System.out.println("The sum will be : " + sum);

    }
}