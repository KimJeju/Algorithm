public class letterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
    }

    public static String letterCapitalize(String str) {
        // TODO:
        //예외처리
         if(str.length() == 0){ //문자열의 길이가 0이라면 ""반환
            return "";
        }

        String[] word = str.split(" "); //공백으로 문자열 나누기
        String result = " ";


        //문자열을 순회하며 공백의 유무 확인
        for(int i = 0; i < word.length; ++i) {
            //받은 문자열이 " " 이라면 다음 문자열을 대문자로 바꿔준다.
          word[i] = String.valueOf(word[i].toUpperCase().charAt(0) + word[i].substring(1));
        }

        result = String.join(" ",word);
        return result;
    }
}

