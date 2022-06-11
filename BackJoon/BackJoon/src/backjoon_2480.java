import java.util.Scanner;

public class backjoon_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int result = 0;

        if(num1 == num2 && num1 == num3 && num2 == num3){
            //모두 같을 시 그냥 num1을 조건에 더해준다
            result = 10000 + num1 * 1000;
        }else if(num1 == num2 && num1 != num3 || num1 == num3 && num2 != num3 || num1 != num2 && num2 == num3){
            //이 부분이 제일 까다로웠다.
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
            //만약 입력 받은 숫자를 4 2 5 라고 치겠다

            //제일 큰 숫자를 더해주기 위해 if문에서 num1과 num3의 크기를 비교해준다
            if(num1 < num3){
                //true라면 num1에 num3에 값을 넣어준다
                num1 = num3;
            }

            //2 5 3 이라고 치겠다

            //제일 큰 숫자를 더해주기 위해 if문에서 num1과 num2의 크기를 비교해준다
            if(num1 < num2){
                //true라면 num1에 num2에 값을 넣어준다
                num1 = num2;
            }
            result = num1 * 100;
        }

        System.out.println(result);
    }
}
