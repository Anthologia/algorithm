import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static boolean[][] map;
    public static boolean[] visited;
    public static int n;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        map = new boolean[n][n];
        visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            map[a][b] = map[b][a] = true;
        }

        System.out.println(dfs(0));
    }

    public static int dfs(int i) {
        visited[i] = true;

        for (int j = 0; j < n; j++) {
            if (isPossible(i, j)) {
                cnt++;
                dfs(j);
            }
        }
        return cnt;
    }

    public static boolean isPossible(int a, int b) {
        return map[a][b] && !visited[b];
    }
}
