
public class Cicle {
    public static void main(String[] args) {
        int a = 100;
        String res = "";
        while (a >= 1) {
            int b = a % 2;
            res = b + res;
            a = a / 2;

        }
        System.out.println(res);
    }
}