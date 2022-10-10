import java.io.*;
import java.util.*;

public class Main {

    static int L, C;
    static int[] alphas;
    static int[] password;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        visited = new boolean[C];
        alphas = new int[C];
        password = new int[L];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            alphas[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(alphas);
        dfs(0, 0);
        System.out.println(sb);
    }

    private static void dfs(int idx, int cnt) {
        if (cnt == L) {
            if (isValidPassword()) {
                for (int v : password) sb.append((char) v);
                sb.append('\n');
            }
        } else {
            for (int i = idx; i < C; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    password[cnt] = alphas[i];
                    dfs(i + 1, cnt + 1);
                    visited[i] = false;
                }
            }
        }
    }

    private static boolean isValidPassword() {
        int vowelCnt = 0;
        int consonantCnt = 0;

        for (int p : password) {
            if (p == 'a' || p == 'i' || p == 'e' || p == 'o' || p == 'u') {
                vowelCnt++;
            } else {
                consonantCnt++;
            }
        }
        return (vowelCnt >= 1) && (consonantCnt >= 2);
    }
}
