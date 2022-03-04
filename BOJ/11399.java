import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] withdrawalTime = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            withdrawalTime[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(withdrawalTime);

        int elapsedTime = 0, sum = 0;
        for (int val : withdrawalTime) {
            elapsedTime += val;
            sum += elapsedTime;
        }
        
        System.out.println(sum);
    }
}
