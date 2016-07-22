import java.util.Scanner;

public class CW04 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Start");

        while (count < 3) {
            System.out.println(count);
            count++;
        }

        System.out.println("End");

        int countForDoWhile = 0;

        do {
            System.out.print(countForDoWhile + " ");
            countForDoWhile++;
        } while (false);

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        while (0 < k){
            System.out.println("False while");
        }

    }
}
