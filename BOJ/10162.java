import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0, c = 0;
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            if (t >= 300) {
                a = t / 300;
                t -= a * 300;
            }
            else if (t >= 60) {
                b = t / 60;
                t -= b * 60;
            }
            else if (t >= 10) {
                c = t / 10;
                t -= c * 10;
            }
            else {
                System.out.println(-1);
                return;
            }
        }
        System.out.printf("%d %d %d\n", a, b, c);
    }
}
