import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (i % 2 == 0) {
            System.out.println("Number " + i + " is even");
        } else {
            System.out.println("Number " + i + " is not even");
        }

    }
}
