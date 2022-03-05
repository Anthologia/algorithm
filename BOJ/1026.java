import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> A = new PriorityQueue<>();
        PriorityQueue<Integer> B = new PriorityQueue<>(Comparator.reverseOrder());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            A.offer(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            B.offer(Integer.parseInt(st.nextToken()));
        }

        int sum = IntStream.range(0, n).map(i -> A.remove() * B.remove()).sum();
        System.out.println(sum);
    }
}
