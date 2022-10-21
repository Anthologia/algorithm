import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int n, s;
    public static final int MAX = 100001;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, last = 0;
        int sum = 0, min = MAX;
        while (start <= n && last <= n) {
            if (sum >= s) min = Math.min(last - start, min);

            if (sum < s) sum += arr[last++];
            else sum -= arr[start++];
        }

        if (min == MAX) System.out.println(0);
        else System.out.println(min);
    }
}
