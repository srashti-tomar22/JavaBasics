package Basics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(71));
        primeNumber(100);
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeNumber(int n){
        for(int i = 1 ; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    //    public static void primeNumber(int n){
//        for (int i = 1 ; i<=n ; i++){
//            boolean flag = true;
//            for (int j = 2; j <= i/2; j++) {
//                if(i%j==0){
//                    flag = false;
//                }
//            }
//            if(flag){
//                System.out.println(i);
//            }
//        }
//    }


}
