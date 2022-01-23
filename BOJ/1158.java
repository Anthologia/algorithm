import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> survivor = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int cnt = 1;

        for(int i = 1; i <= n; i++) survivor.offer(i);
        sb.append('<');

        while (!survivor.isEmpty()) {
            if (cnt == k) {
                sb.append(survivor.poll());
                if (!survivor.isEmpty()) sb.append(", ");
                cnt = 1;
            } else {
                survivor.offer(survivor.poll());
                cnt++;
            }
        }
        sb.append('>');
        System.out.println(sb);
    }
}