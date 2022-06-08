import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class insertDash {
    public static void main(String[] args) {
        System.out.println(insert("454793"));
    }

    public static String insert(String str){
        //문자열을 입력받아 연속된 홀 수 사이에 '-'를 입력한다

        //예외처리
        if(str.length() == 0){
            return null;
        }

        String result = "" + str.charAt(0);

        for(int i = 1; i < str.length() ; ++i){
            int prevNum = Character.getNumericValue(str.charAt(i - 1)) % 2;
            int nextNum = Character.getNumericValue(str.charAt(i)) % 2;
            if(prevNum % 2 != 0 && nextNum % 2 != 0){
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}
