import java.util.Scanner;

public class backJoon_2525_Reference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();

        int a = h * 60 + m + + time; //모두 분으로 초기화 해준다.
        h = a/60; //시간은 a를 나머지 해주고
        m = a%60; //분은 a를 나누기 해준다.

        if(h >= 24){
            h = h - 24; // 만약 시간이 24와 같거나 크다면 시간 -24
        }               //0으로 초기화 하지않은 이유는 1시나 2시 같은 경우가 나올 수 도있기에


        System.out.println(h + " " + m);

    }
}
