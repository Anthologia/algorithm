import java.io.*;

class Main {
    static long[] series = new long[101];

    public static long p(int n) {
        if (series[n] == 0) {
            series[n] = p(n - 2) + p(n - 3);
        }
        return series[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        series[0] = 0L;
        series[1] = 1L;
        series[2] = 1L;
        series[3] = 1L;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(p(n)).append('\n');
        }
        System.out.println(sb);
    }
}
