import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapTest {
    public static void main(String[] args) {
        //String키와 Integer 벨류를 갖는 hashMap
        Map<String,Integer> map = new HashMap<>();

        map.put("꼬부기",95); //put 메서드로 키와 벨류를 넣어줄 수 있다.
        map.put("야도란",80);
        map.put("피카츄",50);

        //저장된 총 엔트리수 저장
        int totalEntry = map.size();

        //객체찾기
        System.out.println("꼬부기 : " + map.get("꼬부기"));

        System.out.println("===========================");

        //객체를 하나씩 처리
        Set<String> keySet = map.keySet(); //Set 컬렉션으로 key얻기

        Iterator<String> iterator = keySet.iterator(); //키셋 이터레이터에 저장

        //반복해서 key를 얻고 map을 통해 value를 알아냄
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "" + value);
        }


    }


}
