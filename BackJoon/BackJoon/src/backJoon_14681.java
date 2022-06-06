import java.util.Scanner;

//4분면을 구분해 분면에 따라 1,2,3,4를 출력하라.
public class backJoon_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 >= 0 && num2 >= 0){  //1분면 ++
            System.out.println(1);
        }else if(num1 < 0 && num2 >= 0){ //2분면 -+
            System.out.println(2);
        }else if(num1 < 0 && num2 < 0){ // 3분면 --
            System.out.println(3);
        }else if(num1 >= 0 && num2 < 0){ //4분면 +-
            System.out.println(4);
        }
    }
}
