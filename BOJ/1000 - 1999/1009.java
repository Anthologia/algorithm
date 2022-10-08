import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int result = 1;
            for(int j = 0; j < b; j++) {
                result = (result * a) % 10;    
            }
            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
    }
}
 
