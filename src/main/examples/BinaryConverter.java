
public class BinaryConverter {
    public static void main(String[] args) {
        int k = 23;

        int b7, b6, b5, b4, b3, b2, b1, b0;

        b7 = k % 2; // 1
        k = k / 2;

        b6 = k % 2;
        k = k / 2;

        b5 = k % 2;
        k = k / 2;

        b4 = k % 2;
        k = k / 2;

        b3 = k % 2;
        k = k / 2;

        b2 = k % 2;
        k = k / 2;

        b1 = k % 2;
        k = k / 2;

        b0 = k % 2;

        System.out.print(b0);
        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.print(b4);
        System.out.print(b5);
        System.out.print(b6);
        System.out.print(b7);
    }
}
