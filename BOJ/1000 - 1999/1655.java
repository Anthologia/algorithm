import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (i % 2 == 0) maxPq.offer(num);
            else minPq.offer(num);

            if (!maxPq.isEmpty() && !minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
                maxPq.offer(minPq.poll());
                minPq.offer(maxPq.poll());
            }
            sb.append(maxPq.peek()).append('\n');
        }
        System.out.println(sb);
    }
}
