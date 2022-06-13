import java.util.Scanner;

public class backjoon_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loop = scanner.nextInt();

       for(int i = 1; i <= loop; ++i){

           //공백을 만들어 주기 위한 포문
           for(int j = loop; j > i; --j){
               System.out.printf(" ");
           }

           for(int k = 1; k <= i; ++k){
               System.out.printf("*");
           }
           System.out.println("");
       }
    }
}
