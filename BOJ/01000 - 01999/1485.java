import java.io.*;
import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            Point[] points = new Point[4];
            ArrayList<Double> l = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    l.add(Math.pow(points[i].x - points[j].x, 2) + Math.pow(points[i].y - points[j].y, 2));
                }
            }

            Collections.sort(l);

            if (Objects.equals(l.get(0), l.get(1)) && Objects.equals(l.get(1), l.get(2)) && Objects.equals(l.get(2), l.get(3)) && Objects.equals(l.get(4), l.get(5))) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.print(sb);
    }
}
