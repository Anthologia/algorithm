import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int depth, int cnt) {
        if (cnt == m) {
            for (int v : arr) {
                sb.append(v).append(" ");
            }
            sb.append('\n');
            return ;
        }

        for (int i = depth; i < n; i++) {
            arr[cnt] = i + 1;
            dfs(i, cnt + 1);
        }
    }
}
