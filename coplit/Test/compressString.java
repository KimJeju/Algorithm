import java.util.Arrays;

public class compressString {
    public static void main(String[] args) {
        System.out.println(compressStrings("wwwggoppopppp"));
    }

    public static String compressStrings(String str){
        //문자열을 입력받아 연속되는 문자가 있을 경우, 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴해야 합니다.
        if(str.length() == 0){
            return "";
        }

        char prev = str.charAt(0);

        int count = 1;

        String result = "";

        str = str + ' ';

        for(int i = 1; i < str.length(); ++i){
            if(prev == str.charAt(i)){
                count++;
            }else{
                if(count >= 3){
                    result = result + count + prev;
                }else{
                    for(int j = 0; j < count; j++) {
                        result = result + prev;
                    }
                }
                prev = str.charAt(i);
                count = 1;
            }
        }

        return result;
    }
}
