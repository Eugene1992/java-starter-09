/**
 * Created by Student on 7/25/2016.
 */
public class EightTask {
    public static void main(String[] args) {
        // 8. Переменной типа int передать результат деления двух short,
        // умноженных на результат деления двух byte

        int res;
        short s1 = 50;
        short s2 = 10;
        byte b1 = 100;
        byte b2 = 20;

        res = (s1 / s2) * (b1 / b2);

        System.out.println(res);


    }
}
