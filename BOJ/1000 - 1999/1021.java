import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (true) {
                int idx = 0;
                for (Integer val : deque) {
                    if (val == num)
                        break;
                    idx++;
                }

                if (idx == 0) {
                    deque.pollFirst();
                    break;
                } else if (idx > deque.size() / 2) {
                    deque.addFirst(deque.removeLast());
                } else {
                    deque.addLast(deque.removeFirst());
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
