/**
 * Created by Student on 7/19/2016.
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.print("a = " + a);
        System.out.println(", b = " + b);

        a = a + b; // a = 30
        b = a - b; // 10
        a = a - b; // 20

        System.out.print("a = " + a);
        System.out.println(", b = " + b);
    }
}
