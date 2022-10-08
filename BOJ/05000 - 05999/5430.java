import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static Deque<Integer> deque;
    public static boolean isR;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String p = br.readLine();
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            deque = new ArrayDeque<>();
            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            ac(p);
        }
        System.out.println(sb);
    }

    private static void ac(String p) {
        isR = false;

        for (byte statement : p.getBytes()) {
            if (statement == 'R') {
                isR = !isR;
                continue;
            }

            if (isR) {
                if (deque.pollLast() == null) {
                    sb.append("error").append('\n');
                    return;
                }
                continue;
            }

            if (deque.pollFirst() == null) {
                sb.append("error").append('\n');
                return;
            }
        }

        makeDequeString();
    }

    private static void makeDequeString() {
        sb.append('[');
        if(deque.size() > 0) {
            if(isR) {
                sb.append(deque.pollLast());
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
            else {
                sb.append(deque.pollFirst());
                while(!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            }
        }
        sb.append(']').append('\n');
    }
}
