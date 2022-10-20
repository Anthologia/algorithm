import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int n, k, max, sec;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) {
            System.out.println(0);
            return;
        }

        max = Math.max(n, k) + 1;
        visited = new boolean[max + 1];

        bfs(n);
    }

    public static void bfs(int loc) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(loc);

        while (!queue.isEmpty()) {
            sec++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.remove();
                visited[cur] = true;

                int walkToPos = cur + 1;
                int walkToNeg = cur - 1;
                int teleport = cur * 2;

                if (walkToNeg == k || walkToPos == k || teleport == k) {
                    System.out.println(sec);
                    return;
                }

                if (isRange(walkToNeg)) {
                    visited[walkToNeg] = true;
                    queue.add(walkToNeg);
                }

                if (isRange(walkToPos)) {
                    visited[walkToPos] = true;
                    queue.add(walkToPos);
                }

                if (isRange(teleport)) {
                    visited[teleport] = true;
                    queue.add(teleport);
                }
            }
        }
    }

    public static boolean isRange(int location) {
        return location >= 0 && location <= max && !visited[location];
    }
}
