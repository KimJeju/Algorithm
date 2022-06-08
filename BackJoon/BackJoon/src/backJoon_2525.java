import java.util.Scanner;

public class backJoon_2525 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int time = scanner.nextInt();

        if((time + minutes) >= 60){
            ++hour;
            minutes = (minutes + time) - 60;

            //만약 hour가 24시와 같거나 넘을 시 0으로 초기화 || 예) 23 48분 .. 25 -> 0시 13분

            if(minutes > 59){ //만약 분 + 받은분 이 60과 같거나 크다면 시간을 한시간 더 늘려주고 분에 60을 빼준다
                ++hour;
                minutes = minutes - 60; //minutes = minutes - 60 과 같다 || -60을 해줌으로서 만약 분이 80일 경우 20분으로 만들어 줄 수 있다.
            }

            if(hour > 23){
                hour = 0;
            }

            System.out.println(hour + " " + minutes);
        }else{
            if(hour >= 24){
                hour = 0;
            }
            System.out.println(hour + " " + (minutes + time));
        }
    }
}


// 1000 / 60, 1000 % 60