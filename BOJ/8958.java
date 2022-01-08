public import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            int sum = 0, cnt = 0;

            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == 'X') {
                    cnt = 0;
                    continue;
                }
                cnt++;
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);

    }
}
