import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), cnt = 0;

        for (int i = 0; i < n; i++) {
            Boolean isGroupWord = true;
            Boolean[] alphabet = new Boolean[26];
            Arrays.fill(alphabet, false);
            String word = br.readLine();
            int prev = word.charAt(0);
            alphabet[prev - 'a'] = true;

            for (int j = 1; j < word.length(); j++) {
                int cur = word.charAt(j);

                if ((prev != cur) && (alphabet[cur - 'a'])) {
                    isGroupWord = false;
                    break;
                }
                prev = cur;
                alphabet[prev - 'a'] = true;
            }
            if (isGroupWord) cnt++;
        }
        System.out.println(cnt);
    }
}