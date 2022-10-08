import java.io.*;
import java.util.*;

class Tomato {
    int h, c, r;

    Tomato(int h, int c, int r) {
        this.h = h;
        this.c = c;
        this.r = r;
    }
}

public class Main {

    static int[][][] graph;
    static Queue<Tomato> queue = new LinkedList<>();

    static int H, N, M;

    // 상 하 좌 우 위 아래
    static int[] dh = {0, 0, 0, 0, 1, -1};
    static int[] dc = {-1, 1, 0, 0, 0, 0};
    static int[] dr = {0, 0, -1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph = new int[H][N][M];

        for (int h = 0; h < H; h++) {
            for (int c = 0; c < N; c++) {
                st = new StringTokenizer(br.readLine());
                for (int r = 0; r < M; r++) {
                    int tomatoStatus = Integer.parseInt(st.nextToken());
                    graph[h][c][r] = tomatoStatus;

                    if (tomatoStatus == 1) queue.offer(new Tomato(h, c, r));
                }
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            Tomato u = queue.remove();

            for (int i = 0; i < dc.length; i++) {
                int mh = u.h + dh[i];
                int mc = u.c + dc[i];
                int mr = u.r + dr[i];

                if (isValidRange(mh, mc, mr) && isNotRipe(graph[mh][mc][mr])) {
                    queue.add(new Tomato(mh, mc, mr));
                    graph[mh][mc][mr] = graph[u.h][u.c][u.r] + 1;
                }
            }
        }

        int maxDays = -1;
        for (int h = 0; h < H; h++) {
            for (int c = 0; c < N; c++) {
                for (int r = 0; r < M; r++) {
                    if (isNotRipe(graph[h][c][r])) return -1;
                    maxDays = Math.max(maxDays, graph[h][c][r]);
                }
            }
        }

        if (maxDays == 1) return 0;
        return maxDays - 1;
    }

    private static boolean isValidRange(int h, int c, int r) {
        return ((h >= 0 && h < H) && (r >= 0 && r < M) && (c >= 0 && c < N));
    }

    private static boolean isNotRipe(int status) {
        return status == 0;
    }
}
