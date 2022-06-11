import java.util.Scanner;

public class backjoon_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int nine = 9;
        int result = 0;

        for(int i = 1; i <= nine; ++i){
            result = num * i;
            System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + result);
        }

    }
}
