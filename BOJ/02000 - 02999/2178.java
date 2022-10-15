import java.io.*;
import java.util.*;

class Coordinate {
    int col, row;

    public Coordinate(int col, int row) {
        this.col = col;
        this.row = row;
    }
}

public class Main {

    static int N, M;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dc = {-1, 1, 0, 0};
    static int[] dr = {0, 0, -1, 1};
    static Queue<Coordinate> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new boolean[N][M];

        for (int c = 0; c < N; c++) {
            String row = br.readLine();
            for (int r = 0; r < M; r++) {
                graph[c][r] = row.charAt(r) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(graph[N - 1][M - 1]);
    }

    private static void bfs(int c, int r) {
        visited[c][r] = true;
        queue.offer(new Coordinate(c, r));

        while (!queue.isEmpty()) {
            Coordinate cord = queue.poll();

            for (int i = 0; i < dc.length; i++) {
                int mc = cord.col + dc[i];
                int mr = cord.row + dr[i];

                if (isRange(mc, mr) && !visited[mc][mr]) {
                    queue.add(new Coordinate(mc, mr));
                    graph[mc][mr] = graph[cord.col][cord.row] + 1;
                    visited[mc][mr] = true;
                }
            }
        }
    }

    private static boolean isRange(int c, int r) {
        return (c >= 0 && c < N) && (r >= 0 && r < M) && (graph[c][r] != 0);
    }
}
