import java.util.Scanner;

/*
문제 : 두 수를 비교하여 알맞은 연산자를 출력하시오

입력 : 첫 줄에 A와 B를 입력받는다. 두 수는 공백으로 나뉘어져 있다.

출력 :

A 가 B 보다 큰 경우 '>' 출력
A 가 B 보다 작은 경우 '<' 출력
a 와 B 가 같은 경우 '==' 출력

*/

public class backJoon_1330 {
    public static void main(String[] args) {

        //수를 입력 받기 위한 scanner 참조변수 선언
        Scanner scanner = new Scanner(System.in);

        //A 를 입력 받을 매개변수 선언
        int A = scanner.nextInt();
        //B 를 입력 받을 매개변수 선언
        int B = scanner.nextInt();
        //두 수를 비교할 if문 작성

        System.out.println(A + " " + B);

        //if
        if(A > B){//A 가 B보다 크면
        // '>' 출력
            System.out.println('>');
        }else if(A < B){//A 가 B 보다 작으면
        // '<'출력
            System.out.println('<');
        }else{
        //'=' 출력
            System.out.println("==");
        }
    }
}
