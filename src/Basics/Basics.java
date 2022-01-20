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
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }


        System.out.println("The sum will be : " + sum);

        // prime number
        int number = 73;
        boolean flag = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("prime");
        } else {
            System.out.println("not-prime");
        }

//        armstrong number
        System.out.println(armstrongno(22));

    }

    public static boolean armstrongno(int num) {
//        153 = 1*1*1 + 5*5*5 + 3*3*3
        int num1 = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (num1 == sum) {
            return true;
        } else {
            return false;
        }
    }




}