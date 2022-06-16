import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class isIsogram {
    public static void main(String[] args) {

    }

    public static boolean isIsogram(String str){

        if(str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        HashMap<Character,String> values = new HashMap<Character,String>();

        for(int i = 0; i < str.length(); ++i){
            if(values.containsKey(str.charAt(i))){
                return false;
            }

            values.put(str.charAt(i),"result");
        }

        return true;
    }
}
