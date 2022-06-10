import java.lang.reflect.Array;
//12
public class abTest {
    public static void main(String[] args) {
        System.out.println(AbTest("abcdb adc"));
    }

    public static boolean AbTest(String str){

        String[] word = str.split(" ");
        boolean result = false;

        for(int i = 0; i < word.length ; ++i){
            if(str.charAt(0) == 'a' && str.charAt(4) == 'b' && word.length == 4
                    || str.charAt(0) == 'b' && str.charAt(4) == 'a' && str.length() == 4){
                result = true;
            }
        }
        return result;
    }
}
