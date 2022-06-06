import java.util.Scanner;

public class backJoon_2525 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();
        int time = scanner.nextInt();

        if((time + minutes) >59){
            ++hour;
            minutes = 60 - (minutes - time);

            if(hour < 0){
                hour = 23;
            }



            System.out.println(hour + " " + minutes);
        }else{
            System.out.println(hour + " " + (minutes + time));
        }
    }
}
