
public class Array2  {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 9, 5};
        int sum = 0;
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
