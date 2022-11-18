import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int Ti = Integer.parseInt(st.nextToken());
            HashMap<Integer, Integer> map = new HashMap<>(Ti);
            boolean isWar = true;

            for (int j = 0; j < Ti; j++) {
                Long id = Long.parseLong(st.nextToken());
                int shortId;
                if (id > Integer.MAX_VALUE) {
                    shortId = -1;
                } else {
                    shortId = Math.toIntExact(id);
                }

                if (map.containsKey(shortId)) {
                    map.put(shortId, map.get(shortId) + 1);
                    if (map.get(shortId) > (Ti / 2)) {
                        sb.append(id).append('\n');
                        isWar = false;
                        break;
                    }
                } else {
                    map.put(shortId, 1);
                }
            }

            if (isWar) {
                sb.append("SYJKGW").append('\n');
            }
            System.gc();
        }
        System.out.println(sb);
    }
}
