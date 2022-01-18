package Array;

public class Array {
    static int size = 0;

    public static void insert(int[] arr, int index, int element){
        if(arr.length == size){
            System.out.println("Array is already full.");
            return;
        }

        for (int i = size-1; i >=index ; i--) {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        size++;
        return;
    }

    public static void main(String[] args) {
        int[] p = new int[10];

        for (int k = 0; k < 4; k++) {
            p[k] = k+1;
            size++;
        }
        System.out.println("Size is "+ size);
        insert(p,1,5);
        System.out.println("Size is "+ size);
        for (int k = 0; k < size; k++) {
            System.out.print(p[k]+" ");
        }
    }


}
