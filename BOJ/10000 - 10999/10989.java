import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()), max = 0, min = 10001;
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            count[val]++;
            if (max < val) max = val;
            if (min > val) min = val;
        }

        for (int i = min; i <= max; i++) {
            while (count[i] > 0) {
                sb.append(i).append('\n');
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}