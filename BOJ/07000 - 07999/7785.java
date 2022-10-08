import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int status = "enter".equals(st.nextToken()) ? 1 : 0;

            hashMap.put(name, status);
        }

        List<String> list = new ArrayList<>();
        hashMap.forEach((key, value) -> {
            if (value == 1) list.add(key);
        });

        list.sort(Collections.reverseOrder());

        for (String l : list) sb.append(l).append('\n');
        System.out.println(sb);
    }
}
