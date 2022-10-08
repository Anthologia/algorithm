// 브루트포스

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int res = 0;
        int[] num = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (num[i] > m) continue;

            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] > m) continue;

                for (int k = j + 1; k < n; k++) {
                    int sum = num[i] + num[j] + num[k];
                    if ((sum <= m) && (sum >= res)) res = sum;
                }
            }
        }
        System.out.println(res);
    }
}
