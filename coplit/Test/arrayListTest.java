import java.util.ArrayList;
import java.util.Iterator;

public class arrayListTest {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> iterator = arrayList.iterator(); //이터레이터 선언 및 이터레이터에 ArrayList 배열을 넣어줌

        arrayList.add("add는");
        arrayList.add("객체를 넣는");
        arrayList.add("arrayList 자체 메서드이다.");

        int size = arrayList.size(); //리스트에 저장된 객체의 총 개수 반환
        String zero = arrayList.get(0); //리스트의 0번째인덱스 반환

        for(int i = 0; i < arrayList.size(); ++i){ //리스트의 사이즈만큼 순환 객체는 3개 3번순환
            String str = arrayList.get(i); //str에 리스트의 i번째 값 넣어주기
            System.out.println(i + " " + str); // 순환값과 i번째 리스트에 관한 값 출력
        }

        while(iterator.hasNext()){ //이터레이터가 ArrayList의 배열에 마지막값까지 순환
            String str2 = iterator.next();
            System.out.println(str2);
        }

        arrayList.remove(0); //리스트의 0 번째 인덱스 삭제
    }


}
