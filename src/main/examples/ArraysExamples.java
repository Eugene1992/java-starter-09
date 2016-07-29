/**
 * Created by deyneko55 on 28.07.16.
 */
public class ArraysExamples {
    public static void main(String[] args) {
        //           0  1   2  3   4
        int[] arr = {2, 5, -2, 6, -10};
        int[] arr1 = {2, 5, -2, 6, -10, 6, 7};
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        //int end = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int k = arr[i] / 2;
        }

    }
}
