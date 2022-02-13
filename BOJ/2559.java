import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int[] X = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            X[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= X.length - k; i++) {
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += X[j];
            }
            if (sum > max) max = sum;
        }
        System.out.println(max);
    }
}
