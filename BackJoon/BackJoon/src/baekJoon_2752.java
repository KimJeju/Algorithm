import java.io.*;

public class baekJoon_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n;

        while(0 < n){
            bw.write(n + "\n");
            --n;
        }

        bw.flush();
        bw.close();
    }
}
