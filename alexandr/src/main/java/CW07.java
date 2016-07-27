/**
 * Created by Student on 7/27/2016.
 */
public class CW07 {
    public static void main(String[] args) {

        System.out.println(getFactorial(5));
    }
    static int getFactorial (int f){
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
}
