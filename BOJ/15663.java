// N과 M (9) - S2

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static int[] nums;
    public static boolean[] visited;
    public static Set<String> set = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        visited = new boolean[n];
        arr = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int cnt) {
        if (cnt == m) {
            StringBuilder tmpSb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                tmpSb.append(arr[i]).append(" ");
            }

            if (!set.contains(tmpSb.toString())) {
                sb.append(tmpSb).append('\n');
                set.add(tmpSb.toString());
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = nums[i];
                dfs(cnt + 1);
                visited[i] = false;
            }
        }
    }
}
