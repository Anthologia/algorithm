import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] scores;
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            scores = new int[Integer.parseInt(st.nextToken())];
            double sum = 0, cnt = 0, avg = 0;

            for (int j = 0; j < scores.length; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            avg = sum / scores.length;
            for (int score : scores) {
                if (score > avg) cnt++;
            }

            System.out.printf("%.3f%%\n" , (100.0 / scores.length) * cnt);
        }
    }
}
