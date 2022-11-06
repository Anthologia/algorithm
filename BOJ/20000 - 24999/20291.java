import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        TreeMap<String, Integer> map = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String extension = br.readLine().split("\\.")[1];
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        System.out.println(sb);
    }
}
