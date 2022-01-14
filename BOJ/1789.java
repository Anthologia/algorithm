import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0, cnt = 0;

        while(sum < s) {
            cnt++;
            sum += cnt;
        }
        if (sum == s)
            System.out.println(cnt);
        else
            System.out.println(cnt - 1);
    }
}
