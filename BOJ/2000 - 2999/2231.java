import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(str);

        for (int i = n - (str.length() * 9); i < n; i++) {
            int tmp = i, sum = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}