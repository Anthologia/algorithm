import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int n, int start, int via, int to) {
        if (n == 1) {
            sb.append(start).append(' ').append(to).append('\n');
        } else {
            hanoi(n - 1, start, to, via);
            sb.append(start).append(' ').append(to).append('\n');
            hanoi(n - 1, via, start, to);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        sb.append((int) Math.pow(2, n) - 1).append('\n');
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }
}
