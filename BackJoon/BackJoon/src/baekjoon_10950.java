import java.util.Scanner;

public class baekjoon_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int next = scanner.nextInt();
        int result = 0;

        for(int i = 0; i < next; ++i){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            result = a + b;

            System.out.println(result);
        }


    }
}
