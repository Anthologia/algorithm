import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] numbers = new int[10];

        for(char c : N.toCharArray()) {
            int num = c - '0';
            if(num == 9) {
                num = 6;
            }
            numbers[num]++;
        }

        numbers[6] = numbers[6]/2 + numbers[6]%2;
        Arrays.sort(numbers);

        System.out.println(numbers[9]);
    }
}
