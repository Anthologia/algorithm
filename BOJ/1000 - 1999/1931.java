import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] meetingHour = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            meetingHour[i][0] = Integer.parseInt(st.nextToken());
            meetingHour[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meetingHour, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int reservedEndTime = 0;

        for (int i = 0; i < n; i++) {
            if (meetingHour[i][0] >= reservedEndTime) {
                reservedEndTime = meetingHour[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
