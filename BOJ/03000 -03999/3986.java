import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();

            for (byte val : br.readLine().getBytes()) {
                Character ch = (char) val;
                if ((!stack.empty()) && (stack.peek() == ch)) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
            if (stack.empty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}