import java.sql.Array;

public class goldBoxAlgorithm {
    public static void main(String[] args) {
        System.out.println(moneyBox(30,new int[]{5,3}));
    }

    public static int moneyBox(int target, int[] type){
        //카운트를 셀 변수선언
        int count = 0;


        for(int i = 0; i < type.length; ++i){
            while (target >= type[i]){
                target = target - type[i];
                count++;
            }
        }

        return count;
    }
}
