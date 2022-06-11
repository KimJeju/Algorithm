import java.util.Scanner;

public class backjoon_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result = 0;

        if(num1 == num2 && num1 == num3 && num2 == num3){
            result = 10000 + num1 * 1000;
        }else if(num1 == num2 && num1 != num3 || num1 == num3 && num2 != num3 || num1 != num2 && num2 == num3){

            if(num1 == num3){
                num1 = num3;
            }

            if(num1 == num2){
                num1 = num2;
            }

            if(num2 == num3){
                num1 = num2;
            }

            result = 1000 + num1 * 100;
        }else if(num1 != num2 && num1 != num3 ){
            if(num1 < num3){
                num1 = num3;
            }

            if(num1 < num2){
                num1 = num2;
            }
            result = num1 * 100;
        }

        System.out.println(result);
    }
}
