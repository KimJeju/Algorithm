import java.util.Map;

public class numberSearch {
    public static void main(String[] args) {
        System.out.println(test("Hello6 "));
    }


    public static int test(String str){

        if(str.length() == 0){
            return 0;
        }

        //문자열에서 숫자 추출
        String num = str.replaceAll("[^0-9]", "");

        //문자열에서 공백제거
        String minusBlank = str.replace(" ","");

        //문자열에서 공백을 제거한 문자열의 길이
        int length = minusBlank.length();


        double result = 0f;

        Integer.valueOf(num);

        String[] word = num.split("");

        for(int i = 0; i < num.length(); ++i){
            result = result + Integer.valueOf(word[i]);
        }

        result =  result / length;


        int b = (int) Math.round((result * 10) / 10);

        return b;
    }
}
