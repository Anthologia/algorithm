import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] values = new int[st.countTokens()];
        int cnt = 0;

        for (int i = 0; i < values.length; i++) {
            StringBuilder sb = new StringBuilder();
            String val = st.nextToken();
            for (int j = val.length() - 1; j >= 0; j--)
                sb.append(val.charAt(j));
            values[cnt++] = Integer.parseInt(sb.toString());
        }
        System.out.println(Arrays.stream(values).max().getAsInt());
    }
}
