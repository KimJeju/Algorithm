import java.util.Scanner;

public class baekjoon_10871 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; ++i){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i = 0; i < N; ++i){
            if(arr[i] < X){
                System.out.println(X + "");
            }
        }
    }
}



