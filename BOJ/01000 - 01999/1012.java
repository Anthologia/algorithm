import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int n, m, k;
    public static boolean[][] arr;
    public static boolean[][] visited;
    public static int[] dc = {0, 0, 1, -1}; // 동 서 남 북
    public static int[] dr = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            arr = new boolean[n][m];
            visited = new boolean[n][m];

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());

                arr[col][row] = true;
            }

            int cnt = 0;
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < m; r++) {
                    if (arr[c][r] && !visited[c][r]) {
                        cnt++;
                        dfs(c, r);
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }

    private static void dfs(int col, int row) {;
        visited[col][row] = true;

        for (int i = 0; i < dc.length; i++) {
            int mr = row + dr[i];
            int mc = col + dc[i];

            if (isRange(mc, mr) && !visited[mc][mr]) {
                dfs(mc, mr);
            }
        }
    }

    private static boolean isRange(int col, int row) {
        return (row >= 0 && row < m) && (col >= 0 && col < n) && arr[col][row];
    }
}
