import java.io.*;
import java.util.*;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();
    static int[] graph;
    static int top, start, dest, up, down;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        top = Integer.parseInt(input[0]);
        start = Integer.parseInt(input[1]);
        dest = Integer.parseInt(input[2]);
        up = Integer.parseInt(input[3]);
        down = Integer.parseInt(input[4]);

        graph = new int[top + 1];

        bfs(start);
    }

    private static void bfs(int k) {
        queue.add(k);
        graph[k] = 1;

        while (!queue.isEmpty()) {
            int cur = queue.remove();

            if (cur == dest) {
                System.out.println(graph[cur] - 1);
                return;
            }

            if (isRange(cur + up)) {
                graph[cur + up] = graph[cur] + 1;
                queue.add(cur + up);
            }
            if (isRange(cur - down)) {
                graph[cur - down] = graph[cur] + 1;
                queue.add(cur - down);
            }
        }
        System.out.println("use the stairs");
    }

    private static boolean isRange(int i) {
        return i >= 1 && i <= top && graph[i] == 0;
    }
}
