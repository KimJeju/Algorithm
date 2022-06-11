
public class abTest {
    public static void main(String[] args) {
        System.out.println(AbTest("abcdb adc"));
    }

    public static boolean AbTest(String str){

       str = str.toLowerCase();

       if(str.length() == 0){
           return false;

       }
        for(int i = 0; i < str.length() ; ++i){
            if(str.charAt(i) == 'a' && str.charAt(i + 4) == 'b'
                    || str.charAt(i) == 'b' && str.charAt(i + 4) == 'a'){
                return true;
            }
        }
        return false;
    }
}
