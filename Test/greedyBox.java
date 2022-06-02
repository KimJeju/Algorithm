import java.util.Arrays;

import static java.util.Arrays.sort;

public class greedyBox {
    public static void main(String[] args) {

        System.out.println(boxGreedy(new int[]{42,25,60,73,103,167},187));
    }

    public static int boxGreedy(int[] stuff,int limit){
        //박스 개수를 셀 카운트

        int count = 0;

        //박스 오름차순으로 정렬해주기
        Arrays.sort(stuff);

        //오름차순으로 정렬했기에 배열의 0번째는 항상 최소값
        int left = 0;
        //오른쪽은 최대값
        int right = stuff.length - 1;

        //left의 값이 right를 초과할때 까지 반복
        while(left < right){
            //만약 배열의 최소값과 최대값을 더했을 때, 리미트 이하인 경우
            if(stuff[left] + stuff[right] <= limit){
                //다음값을 알아내기 위해 left ++
                left++;
                //right의 다음값을 알아내기위해 --right
                right--;
                //박스에 stuff[left] 와 stuff[right]를 담았음으로
                //박스에 +1
                count++;
            }else{
                //최소값과 최대값의 합이 한계를 초과하였을떄
                //최소값과 다음 최대값을 더한값을 비교하기위해
                //left는 가만히 두고 right만 한칸 움직여 준다.
                right--;
            }

        }

        //반복문을 종료했다면 기존 배열의 길이에 - 카운트 반환
        return stuff.length - count ;
    }
}

