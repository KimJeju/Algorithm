import java.util.Scanner;

public class backjoon_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < num; ++i) {
            result = result + i;
            ++result;
        }

        System.out.println(result);

    }
}
