import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String number = br.readLine();
        int sum = 0;

        for (int i = 0; i < number.length(); i++)
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        
        System.out.println(sum);
    }
}
