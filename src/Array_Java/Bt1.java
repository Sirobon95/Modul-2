package Array_Java;

public class Bt1 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 3};
        int[] a = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[i];
            a[i] = i - 1 ;
            System.out.println(a);

        }
    }

}
