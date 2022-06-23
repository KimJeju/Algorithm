import java.util.ArrayList;

public class decryptCaesarCipher {
    public static void main(String[] args) {

        System.out.println(decryptCaesarCipher("hello",3));
    }

    public static String decryptCaesarCipher(String str, int secret){

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String result = "";

        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ' '){
                result += str.charAt(i);
            }else{
                int prev = alpha.indexOf(str.charAt(i));
                int next = (prev - secret + alpha.length()) % alpha.length();

                result += alpha.charAt(next);
            }
        }

        return result;
    }
}
