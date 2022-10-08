import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int sum = 0, max = 0;
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 3; i++) {
                int val = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
                if (max < val) max = val;
                sum += val;
            }
            if (sum == 0) break;
            else if ((sum - max) % max == 0) sb.append("right").append('\n');
            else sb.append("wrong").append('\n');
        }
        System.out.println(sb);
    }
}
