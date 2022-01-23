import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Byte> vpsStack = new Stack<>();
            String str = br.readLine();
            
            for (byte val : str.getBytes()) {
                if (val == '(') {
                    vpsStack.push(val);
                } else if (vpsStack.empty()) {
                    vpsStack.push(val);
                    break;
                } else {
                    vpsStack.pop();
                }
            }
            
            if (vpsStack.empty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}