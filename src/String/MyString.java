package String;

public class MyString {

    public static void main(String[] args) {

        System.out.println(isPalindromeNaive("ABcccccdBA"));

    }

    //   Time complexity-O(n)
    //    Space Complexity-O(n)
    public static boolean isPalindromeNaive(String str) {
        String str1 = "";

        for ( int i = str.length() - 1; i >= 0; i--) {
            str1 = str1+str.charAt(i);

        }
        if (str.compareTo(str1) == 0) {
            return true;
        } else return false;


    }



    //second method---->
    //   Time complexity-O(n) or O(n/2)
    //    Space Complexity-O(1)
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }return true;

    }

}













