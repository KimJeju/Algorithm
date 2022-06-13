import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11022 {
    public static void main(String[] args) throws IOException {
        //버퍼리더 선언 scanner와 비슷
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //반복을 돌기위해 받을 수 BufferedReader 는 String형으로만 반환되기 때문에 형변환을 해주어야 함
        int T = Integer.parseInt(br.readLine());
        //입력받을 a,b선언
        int A;
        int B;

        //br을 공백으로 쪼개기 위한 st
        StringTokenizer st;
        for(int i = 1; i <= T; ++i){
            st = new StringTokenizer(br.readLine()," ");
             A = Integer.parseInt(st.nextToken());
             B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
        }
        br.close();
    }
}
