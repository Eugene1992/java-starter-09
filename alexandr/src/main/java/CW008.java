
public class CW008 {
        public static void main(String[] args) {
            // write your code here
            printSequence(1, 1000);
            System.out.println();
            getMqx(1, 10, 13);
            int sumF = factorial(5);
            System.out.println(sumF);
        }

        static void printSequence(int start, int end) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum = sum + i;
            }
            System.out.print(sum);
        }

        static void getMqx(int i1, int i2, int i3) {
            if (i1 > i2 && i1 > i3) {
                System.out.println(i1);
            }
            if (i2 > i1 && i2 > i3) {
                System.out.println(i2);
            }
            if (i3 > i1 && i3 > i2) {
                System.out.println(i3);
            }
        }

        static int factorial(int f) {
            int sumf = 1;
            for (int i = f; i >= 1; i--) {
                sumf = sumf * i;
            }
            return sumf;
        }

}
