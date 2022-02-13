import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int[] X = new int[Integer.parseInt(br.readLine())];
            int max = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < X.length; j++) {
                X[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < X.length; j++) {
                int sum = 0;

                for (int k = j; k < X.length; k++) {
                    sum += X[k];
                    if (sum > max) max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
