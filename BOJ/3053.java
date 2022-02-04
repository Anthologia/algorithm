import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(br.readLine()), powR2 = Math.pow(r, 2);

        System.out.printf("%.6f %.6f", Math.PI * powR2, powR2 * 2);
    }
}