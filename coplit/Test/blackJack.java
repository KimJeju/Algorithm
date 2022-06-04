import java.util.Enumeration;

public class blackJack {
    public static void main(String[] args) {

    }

    public static int BlackJack(int[] cards) {
        int count = 0;
        //int length = cards.length;

        for (int i = 1; i < cards.length; ++i) {
            for(int j = i + 1; j < cards.length; ++j){
                for(int k = j + 1; k < cards.length; ++k){
                    int sum = cards[i] + cards[j] + cards[k];

                    if(isPrime(sum)){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    //받은 수가 소수 인지 판단하는 함수
    public static Boolean isPrime(int number) {
        for (int i = 2; i<=(int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
