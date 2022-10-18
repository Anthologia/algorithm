import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> X = new ArrayList<>(N);
        List<Integer> sortedX = new ArrayList<>(N);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            X.add(v);
            sortedX.add(v);
        }

        Collections.sort(sortedX);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int x : sortedX) {
            if (!map.containsKey(x)) {
                map.put(x, rank++);
            }
        }

        for (Integer x : X) {
            sb.append(map.get(x)).append(' ');
        }

        System.out.println(sb);
    }
}
