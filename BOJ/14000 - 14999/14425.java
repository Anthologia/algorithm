// 14425 S3 문자열 집합 - 자료구조, 해시
// https://www.acmicpc.net/problem/14425

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(br.readLine(), 0);
        }

        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            hashMap.computeIfPresent(word, (str, cnt) -> ++cnt);
        }

        System.out.println(hashMap.values().stream().reduce(Integer::sum).get());
    }
}
