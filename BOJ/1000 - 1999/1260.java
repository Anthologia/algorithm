import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[][] graph;
    static boolean[] visited;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken()) - 1;
        graph = new boolean[n][n];
        visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 =  Integer.parseInt(st.nextToken()) - 1;
            int v2 =  Integer.parseInt(st.nextToken()) - 1;

            graph[v1][v2] = true;
            graph[v2][v1] = true;
        }

        dfs(start);
        Arrays.fill(visited, false);
        
        sb.append('\n');
        bfs(start);
        System.out.println(sb);
    }

    public static void bfs(int start) {
        visited[start] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int u = queue.remove();
            sb.append(u + 1).append(" ");

            for (int i = 0; i < n; i++) {
                if (graph[u][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start + 1).append(" ");

        for (int i = 0; i < n; i++) {
            if (graph[start][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}
