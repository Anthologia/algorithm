// 랜선 자기 S2
// 이분 탐색

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lines = new int[K];

        long start = 1, mid, last = 0;

        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if (lines[i] > last) last = lines[i];
        }

        long ans = 0;
        while (start <= last) {
            mid = (start + last) / 2;
            int cnt = 0;
            for (int i = 0; i < K; i++) {
                cnt += lines[i] / mid;
            }

            if (cnt >= N) {
                start = mid + 1;
                if (mid > ans) ans = mid;
            } else {
                last = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
