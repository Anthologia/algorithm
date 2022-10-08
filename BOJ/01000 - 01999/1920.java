import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        long[] brr = new long[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            brr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for (long val : brr) {
            int start = 0, end = arr.length - 1;
            int mid = (start + end) / 2;
            int flag = 0;

            while (end - start >= 0) {
                if (arr[mid] == val) {
                    flag = 1;
                    break;
                }
                else if (arr[mid] <= val) start = mid + 1;
                else end = mid - 1;
                mid = (start + end) / 2;
            }
            sb.append(flag).append('\n');
        }
        System.out.println(sb);
    }
}
