import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] point1 = br.readLine().split(" ");
        String[] point2 = br.readLine().split(" ");
        String[] point3 = br.readLine().split(" ");
        
        String x = (point1[0].equals(point2[0])) ? point3[0] : ((point1[0].equals(point3[0]))) ? point2[0] : point1[0];
        String y = (point1[1].equals(point2[1])) ? point3[1] : ((point1[1].equals(point3[1]))) ? point2[1] : point1[1];

        System.out.println(x + " " + y);
    }
}