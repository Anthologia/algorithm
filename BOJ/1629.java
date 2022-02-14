import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static long pow(long a, long b, long c) {
        if (b == 1) return a % c;

        long temp = pow(a, b / 2, c);

        // (temp * temp * c) % c = ((temp * temp % c) * (a % c)) % c
        //                       = ((temp * temp % c) % c * (a % c)) % c
        //                       = ((temp * temp % c) * a ) % c
        if (b % 2 == 1) return ((temp * temp % c) * a ) % c;

        return temp * temp % c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()), c = Long.parseLong(st.nextToken());
        System.out.println(pow(a, b, c));
    }
}
