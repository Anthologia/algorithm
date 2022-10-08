import java.io.*;

public class Main {
    public static boolean hansu(int n) {
        int prev = n % 10;
        int gongcha = prev - ((n / 10) % 10);

        //      문자열 인덱싱 방식
        String st = Integer.toString(n / 10);
        for (int i = st.length() - 1; i >= 0; i--) {
            int val = (st.charAt(i) - '0');
            if (gongcha != prev - val) return false;
            gongcha = prev - val;
            prev = val;
        }
        
//        산술연산 방식
//        n = n / 10;
//        while (n > 0) {
//            int val = n % 10;
//            if (gongcha != prev - val) return false;
//            gongcha = prev - val;
//            prev = val;
//            n = n / 10;
//        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if(hansu(i)) cnt++;
        }
        System.out.println(cnt);

    }
}
