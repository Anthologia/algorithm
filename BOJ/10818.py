import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(min,temp);
            max = Math.max(max,temp);
        }
        System.out.println(min + " " + max);
    }
}