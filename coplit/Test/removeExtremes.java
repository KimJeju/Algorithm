import java.util.Arrays;

public class removeExtremes {
    public static void main(String[] args) {
        System.out.println(removeExtreme(new String[]{"where", "is", "the", "longest", "word"}));
    }

    public static String[] removeExtreme(String[] arr){

       if(arr.length == 0){
           return null;
       }

       int maxWord = 0;
       int minWord = 20;
       int maxIdx = 0;
       int minIdx = 0;


       for(int i = 0; i < arr.length; ++i){
           if(arr[i].length() >= maxWord) {
               maxWord = arr[i].length();
               maxIdx = i;
           }
           if(arr[i].length() <= minWord){
               minWord = arr[i].length();
               minIdx = i;
           }

       }


        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != maxIdx && i != minIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }

       return result;

    }
}
