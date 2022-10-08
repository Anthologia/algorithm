import java.io.*;
import java.util.*;

class Node {
    int index, weight;

    public Node(int index, int weight) {
        this.index = index;
        this.weight = weight;
    }
}

public class Main {
    static ArrayList<Node>[] nodes;
    static boolean[] visited;
    static int maxWeight;
    static int maxIndex;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        nodes = new ArrayList[n + 1];

        for (int i = 0; i < n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int pv = Integer.parseInt(st.nextToken()) - 1;
            int cv = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());

            nodes[pv].add(new Node(cv, w));
            nodes[cv].add(new Node(pv, w));
        }

        dfs(0, 0);
        Arrays.fill(visited, false);
        dfs(maxIndex, 0);

        System.out.println(maxWeight);
    }

    public static void dfs(int start, int w) {
        visited[start] = true;
        if (maxWeight < w) {
            maxWeight = w;
            maxIndex = start;
        }

        for (Node node : nodes[start]) {
            if (!visited[node.index]) {
                dfs(node.index,  w + node.weight);
            }
        }
    }

}
