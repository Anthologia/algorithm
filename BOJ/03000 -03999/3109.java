import java.io.*;
import java.util.*;

public class Main {
    public static int r, c;
    public static int cnt = 0;
    public static boolean[][] map;
    public static int[] dc = {-1, 0, 1}; // 오른쪽 위 대각선, 오른쪽, 오른쪽 아래 대각선

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                map[i][j] = line.charAt(j) == '.';
            }
        }

        for (int i = 0; i < r; i++) {
            dfs(i, 0);
        }
        System.out.println(cnt);
    }

    public static boolean dfs(int row, int col) {
        if (col == c - 1) {
            cnt++;
            return true;
        }

        for (int dir : dc) {
            int mr = row + dir;
            int mc = col + 1;

            if (isPossible(mr, mc)) {
                map[mr][mc] = false;
                if (dfs(mr, mc)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPossible(int row, int col) {
        return (row >= 0 && row < r && col >= 0 && col < c) && map[row][col];
    }
}
