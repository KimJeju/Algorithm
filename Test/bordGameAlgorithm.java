import java.util.HashMap;

public class bordGameAlgorithm {
    public static void main(String[] args) {

    }

    public Integer boardGame(int[][] board, String operation) {
        // TODO:

        //hashmap 선언 후 입력되는 명령에에 따라 좌표 넣어주기
        HashMap<String,int[]> key = new HashMap<String, int[]>(){{
            put("U",new int[]{-1,0});
            put("D",new int[]{1,0});
            put("L",new int[]{0,-1});
            put("R",new int[]{0,1});
        }};


        //보드의 길이선언 정사각형이기떄문에 length 메서드를 사용해도 무관
        int len = board.length;

        //시작점수와 좌표를 0으로 선언
        int X = 0;
        int Y = 0;
        int score = 0;

        //입력받은 operation을 char배열로 전환
        char[] chars = operation.toCharArray();

        //해당 배열만큼 반복
        for(int i = 0; i < chars.length; ++i){
            int dY = key.get(String.valueOf(chars[i]))[0]; //위 아래 0번째 인덱스
            int dX = key.get(String.valueOf(chars[i]))[1]; //좌우 1번째 인덱스
            if(!isValid(X,Y,len)) return null; // 보드밖을 나가면 리턴 null
            X += dY;
            Y += dX;

            score += board[X][Y];
        }
        return score;
    }

    public boolean isValid(int X,int Y,int LEN){
        return 0 <= X && Y < LEN && 0 <= X && Y < LEN;
    }
}


