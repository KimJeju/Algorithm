import java.sql.SQLOutput;
import java.util.Scanner;

public class backJoon_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int resultSum = a+b;
        int resultMinus = a-b;
        int resultMultiply = a*b;
        int resultDive = a/b;
        int result = a%b;

        System.out.println(resultSum);
        System.out.println(resultMinus);
        System.out.println(resultMultiply);
        System.out.println(resultDive);
        System.out.println(result);

    }
}
