import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken()), r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken()), r2 = Integer.parseInt(st.nextToken());
            int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append('\n');
            } else if (Math.pow(r1 + r2, 2) < d || Math.pow(r2 - r1, 2) > d) {
                sb.append(0).append('\n');
            } else if (Math.pow(r1 + r2, 2) == d || Math.pow(r2 - r1, 2) == d) {
                sb.append(1).append('\n');
            } else {
                sb.append(2).append('\n');
            }
        }
        System.out.println(sb);
    }
}
