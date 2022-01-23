import java.io.*;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()), val, back = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    back = Integer.parseInt(st.nextToken());
                    queue.add(back);
                    break;
                case "pop":
                    val = Optional.ofNullable(queue.poll()).orElse(-1);
                    sb.append(val).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    val = Optional.ofNullable(queue.peek()).orElse(-1);
                    sb.append(val).append('\n');
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : back).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}