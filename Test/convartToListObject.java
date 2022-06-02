import java.util.HashMap;

public class convartToListObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"key","value"},
                {"hello","world"},
                {"Good","Morning"},
                {"key","test"} //중복된 값임으로 초기값으로 선언됨
        };

        HashMap<String,String> result = convertToListOBject(arr);

        System.out.println(result);
    }
    //문제 : 2차원 배열을 입력받아 각 배열을 이용해 만든 haspMap을 반환해라

    //hashMap의 key와 value 값으로 String을 파라미터로 받으며 String 타입의 2차원배열을 매개변수로 갖는 메서드
    public static HashMap<String,String> convertToListOBject(String[][] arr){

        //배열을 받아줄 String,String 타입을 파라미터로 갖는 hashMap 선언
        HashMap<String,String> result = new HashMap<>();

        //예외 : arr[i] 길이가 0 인경우 무시
        if(arr.length == 0){}

        //for문을 돌며 arr의 길이만큼 순회
        for(int i = 0; i < arr.length; ++i){

            //만약 arr[i]의 값이 비어지지 않았거나 result가 빈배열이 아니라면
            if(arr[i].length != 0 && !result.containsKey(arr[i][0])){
                //result에 각 배열에 맞는 값을 담아준다
                result.put(arr[i][0],arr[i][1]);
            }

        }
        //예외 : 중복되는 키의 경우, 초기값 사용
        //빈 배열을 입력받은 경우 , 빈 hashMap리턴
        return result;
    }
}
