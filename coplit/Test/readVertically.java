public class readVertically {
    public static void main(String[] args) {

        String[] input = new String[]{
                "hello",
                "world",
        };

       String output = readVertically(input);
        System.out.println(output);
    }

    public static String readVertically(String[] arr) {

        //최대길이
        int maxLength = 0;

        for(int i = 0; i < arr.length; ++i){
            if(maxLength < arr[i].length()) {
                maxLength = arr[i].length();
            }
        }

        String[] temp = new String[maxLength];

        for(int i = 0; i < arr.length; ++i ){
            String str = arr[i];
            for(int j = 0; j < str.length(); ++j){
                if(temp[j] == null){
                    temp[j] = Character.toString(str.charAt(j));
                }else{
                    temp[j] += str.charAt(j);
                }
            }
        }

        String result = "";
        for(int i = 0; i < temp.length; ++i){
            result += temp[i];
        }

        return result;
    }
}
