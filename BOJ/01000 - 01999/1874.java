import java.io.*;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()), cnt = 0;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (cnt < x) {
                while (cnt < x) {
                    stack.push(++cnt);
                    sb.append('+').append('\n');
                }
                stack.pop();
                sb.append('-').append('\n');
            } else {
                if (stack.peek() != x) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append('-').append('\n');
            }
        }
        System.out.println(sb);
    }
}
