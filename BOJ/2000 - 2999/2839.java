import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), cnt = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                System.out.println(cnt + n / 5);
                return;
            } else {
                n -= 3;
                cnt++;
            }
        }
        System.out.println(-1);
    }
}