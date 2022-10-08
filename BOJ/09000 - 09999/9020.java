import java.io.*;

public class Main {
    public static int MAX = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] prime = new boolean[MAX + 1];

        for (int i = 2; i <= MAX; i++) prime[i] = true;
        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (!prime[i]) continue;
            for (int j = i + i; j <= MAX; j += i) {
                prime[j] = false;
            }
        }

        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            int part1 = n / 2, part2 = n / 2;

            for (int j = 0; j <= n; j++) {
                if (prime[part1] && prime[part2]) {
                    if (part1 + part2 == n) {
                        sb.append(part1).append(' ').append(part2).append('\n');
                        break;
                    }
                }
                part1--;
                part2++;
            }
        }
        System.out.println(sb);
    }
}
