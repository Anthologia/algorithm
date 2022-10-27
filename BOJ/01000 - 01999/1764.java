import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        HashSet<String> unheard = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unheard.add(br.readLine());
        }

        ArrayList<String> notSeen = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String person = br.readLine();
            if(unheard.contains(person)){
                notSeen.add(person);
            }
        }

        Collections.sort(notSeen);

        sb.append(notSeen.size()).append('\n');
        for (String s : notSeen) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
