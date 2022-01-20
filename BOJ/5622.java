import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int time = 0;
        for (byte val : br.readLine().getBytes()) {
            if(val < 68) time += 3;
            else if(val < 71) time += 4;
            else if(val < 74) time += 5;
            else if(val < 77) time += 6;
            else if(val < 80) time += 7;
            else if(val < 84) time += 8;
            else if(val < 87) time += 9;
            else time += 10;
        }
        System.out.println(time);
    }
}