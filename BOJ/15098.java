import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            if (hashMap.putIfAbsent(word, 1) != null) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
