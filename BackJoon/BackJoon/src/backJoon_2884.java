import java.util.Scanner;

public class backJoon_2884 {
    public static void main(String[] args) {


        int h,m; //시간을 입력받을 변수

        Scanner scanner = new Scanner(System.in);

        h = scanner.nextInt(); //시간
        m = scanner.nextInt(); //분

        if(m < 45) { //만약 받은 인자가 45분 보다 작으면? 즉 m - 45 가 60분을 초과하였단 이야기이다.
            --h; // 시간을 가감해준다.
            m = 60 - (45 - m); // 분에 60 빼기 줄일분 빼기 현재 받은 시간
            if(h < 0){
                h = 23; //만약 시간기준으로 0초보다 h가 작으면 23시로 초기화 해준다
            }
            System.out.println(h + " " + m);
        }else{
            System.out.println(h + " " + (m - 45)); //60 - 45가 60을 초과하지 않을 경우 분에 45를 빼주어 그대로 출력
        }

    }
}
