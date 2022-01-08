import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] scores = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double max = 0, sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            max = Math.max(scores[i], max);
        }

        for (double score : scores) sum += score / max * 100;
        System.out.println(sum / scores.length);

    }
}
