import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while (true) {
            Stack<Byte> stack = new Stack<>();
            String str = br.readLine();
            if (".".equals(str)) break;

            for (byte val : str.getBytes()) {
                if (val == '(' || val == '[') {
                    stack.push(val);
                } else if (val == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        stack.push(val);
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (val == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        stack.push(val);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);
    }
}