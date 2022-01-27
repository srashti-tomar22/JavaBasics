package Array;

public class EqPoint {

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        equilibrium(arr);
    }
    // eqiuilibrium of indexes
    public static void equilibrium(int[] arr){

        for (int i = 1; i < arr.length ; i++) {
            int leftsum=0;
            int rightsum=0;
            for (int j = 0; j <= i-1 ; j++) {
                leftsum =leftsum+arr[j];
            }
            for (int k = i+1; k < arr.length ; k++) {
                rightsum = rightsum+arr[k];
            }
//            System.out.println(leftsum+" "+rightsum);
             if(leftsum==rightsum)    {
                 System.out.println(i);
             }
        }

    }
}
