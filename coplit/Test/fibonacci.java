import java.util.ArrayList;

public class fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int num){

        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);
        return aux(memo,num);
    }

    public static int aux(ArrayList<Integer> memo, int num){

        if(memo.size() <= num){
            memo.add(aux(memo,num - 2) + aux(memo,num - 1));
        }

        return memo.get(num);
    }
}
