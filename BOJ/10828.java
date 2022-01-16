import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> stack = new ArrayList<>();
    static int idx = stack.size() - 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            idx = stack.size() - 1;
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int val) {
        stack.add(val);
    }

    public static int pop() {
        if (idx >= 0) return stack.remove(idx);
        else return -1;
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    public static int top() {
        if (idx >= 0) return stack.get(idx);
        else return -1;
    }
}
