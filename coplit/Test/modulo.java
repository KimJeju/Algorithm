public class modulo {
    public static void main(String[] args) {
        System.out.println(Test(123,4));
    }

    public static Integer Test(int num1,int num2){

        //리턴받을 변수
        Integer result = 0;

        //합계를 계산해서
        result = num1 + num2;

        //num2가 0일시 나눌 수 없기 때문에 null을 리턴
        if(num2 == 0){
            return null;
        }


        //포문을 돌며 i는 num2 값으로 대입 후 num1 + num2 와 같을 때까지 반복을 돈다
        //증감식은 쓰지않는다.
        for(int i = num2; i <= result;){

            //result에 i를 빼준다
            result -= i;

            //빼준값의 최종이 0이라면 리턴 0
            if(result == 0){
                return 0;
            }

            //빼준값의 최종이 1 이라면 result리턴
            if(result == 1){
                return result;
            }
        }

        //if문에 해당하지 않는다면 num1-num2를 result에 리턴
        return result;

    }
}
