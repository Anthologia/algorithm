import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int n, m;
    public static int[] woods;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        woods = new int[n];

        int maxWood = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            woods[i] = Integer.parseInt(st.nextToken());
            maxWood = Math.max(maxWood, woods[i]);
        }

        int start = 0, end = maxWood;

        while (start < end) {
            int mid = (start + end) / 2;

            long sum = 0;
            for (int wood : woods) {
                sum += Math.max(wood - mid, 0);
            }

            if (sum < m) end = mid;
            else start = mid + 1;
        }
        System.out.println(start - 1);
    }
}
