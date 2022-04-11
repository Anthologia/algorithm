import java.io.*;
import java.util.*;

public class Main {
    public static int[] histogram;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        histogram = new int[n + 2];

        for (int i = 1; i < n + 1; i++) {
            histogram[i] = Integer.parseInt(br.readLine());
        }
        histogram[n + 1] = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ans = 0;

        for (int i = 1; i < n + 2; i++) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (histogram[top] <= histogram[i]) {
                    break;
                }
                stack.pop();
                ans = Math.max(ans, histogram[top] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        System.out.println(ans);
    }
}
