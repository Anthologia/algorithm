// 11286 S1 절댓값 힙 - 자료구조, 우선순위 큐
// https://www.acmicpc.net/problem/11286

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        });

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (!pq.isEmpty()) sb.append(pq.poll()).append('\n');
                else sb.append(0).append('\n');
            } else {
                pq.add(x);
            }
        }

        System.out.println(sb);
    }
}
