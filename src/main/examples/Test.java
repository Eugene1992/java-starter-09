import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7};

        /*System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(printArray(arr));*/

        System.out.println(subString("Hello world", 2, 6));
    }

    static String printArray(int[] arr){
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            /*if (i == arr.length - 1) {
                res = res + arr[i];
            } else {
                res = res + arr[i] + ", ";
            }*/
            res = i == arr.length - 1 ? res + arr[i] : res + arr[i] + ", ";
        }
        return res + "]";
    }

    static String subString(String str, int from, int to){
        String res = "";
        char[] chars = str.toCharArray();
        for (int i = from; i < to; i++) {
            res = res + chars[i];
        }
        return res;
    }

}
