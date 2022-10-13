import java.io.*;
import java.util.*;

public class Main {

    static int N, houseCnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dc = {-1, 1, 0, 0};
    static int[] dr = {0, 0, -1, 1};
    static int complexId = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        visited = new boolean[N][N];

        for (int c = 0; c < N; c++) {
            String row = br.readLine();
            for (int r = 0; r < N; r++) {
                graph[c][r] = row.charAt(r) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int c = 0; c < N; c++) {
            for (int r = 0; r < N; r++) {
                if (graph[c][r] != 0 && !visited[c][r]) {
                    houseCnt = 0;
                    dfs(c, r);
                    list.add(houseCnt);
                    complexId++;
                }
            }
        }
        sb.append(complexId - 1).append('\n');
        
        Collections.sort(list);
        for (Integer l : list) {
            sb.append(l).append('\n');
        }
        
        System.out.println(sb);
    }

    private static void dfs(int c, int r) {
        graph[c][r] = complexId;
        visited[c][r] = true;
        houseCnt++;

        for (int i = 0; i < dc.length; i++) {
            int mc = c + dc[i];
            int mr = r + dr[i];

            if (isRange(mc, mr) && !visited[mc][mr]) {
                dfs(mc, mr);
            }
        }
    }

    private static boolean isRange(int c, int r) {
        return (c >= 0 && c < N) && (r >= 0 && r < N) && (graph[c][r] != 0);
    }
}
