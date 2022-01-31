import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        int cnt = 0;

        for (byte val : str.getBytes()) {
            if (val == ')') {
                if (stack.empty()) cnt++;
                else stack.pop();
            } else {
                stack.push((char) val);
            }
        }
        System.out.println(cnt + stack.size());
    }
}