import java.io.*;
import java.util.*;

class Main {
    public static int MAX = 1000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int range = (k * 2) + 1;
        int[] bucket = new int[MAX];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            bucket[x] = g;
        }

        int sum = 0, max = 0;
        for (int i = 0; i < MAX; i++) {
            if (i >= range) sum -= bucket[i - range];
            sum += bucket[i];

            if(sum > max) max = sum;
        }

        System.out.println(max);
    }
}
