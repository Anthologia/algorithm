import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), cnt = 0;
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (k / coins[i] > 0) {
                cnt += k / coins[i];
                k %= coins[i];
            } else if (k == 0) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
