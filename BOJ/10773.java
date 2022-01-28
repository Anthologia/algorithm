import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val != 0) stack.push(val);
            else stack.pop();
        }
        System.out.println(stack.stream().mapToInt(value -> value).sum());
    }
}
