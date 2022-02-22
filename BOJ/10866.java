import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String token = st.nextToken();

            if ("push_front".equals(token)) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if ("push_back".equals(token)) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if ("pop_front".equals(token)) {
                sb.append(Optional.ofNullable(deque.pollFirst()).orElse(-1)).append('\n');
            } else if ("pop_back".equals(token)) {
                sb.append(Optional.ofNullable(deque.pollLast()).orElse(-1)).append('\n');
            } else if ("size".equals(token)) {
                sb.append(deque.size()).append('\n');
            } else if ("empty".equals(token)) {
                sb.append(deque.isEmpty() ? 1 : 0).append('\n');
            } else if ("front".equals(token)) {
                sb.append(Optional.ofNullable(deque.peekFirst()).orElse(-1)).append('\n');
            } else if ("back".equals(token)) {
                sb.append(Optional.ofNullable(deque.peekLast()).orElse(-1)).append('\n');
            }
        }

        System.out.println(sb);
    }
}
