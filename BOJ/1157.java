import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        int[] wordCnt = new int[26];
        int max = -1, maxIdx = -1;

        for (byte alphabet : word.getBytes())
            wordCnt[alphabet - 'A']++;

        for (int i = 0; i < 26; i++) {
            if (wordCnt[i] == max) maxIdx = -2;
            if (wordCnt[i] > max) {
                max = wordCnt[i];
                maxIdx = i;
            }
        }
        System.out.println((char) (maxIdx + 'A'));
    }
}
