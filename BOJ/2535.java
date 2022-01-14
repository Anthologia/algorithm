import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    int countryNum;
    int studentNum;
    int score;

    public Student(int countryNum, int studentNum, int score) {
        this.countryNum = countryNum;
        this.studentNum = studentNum;
        this.score = score;
    }

    @Override
    public String toString() {
        return countryNum + " " + studentNum + "\n";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.score, this.score);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int countryNum, studentNum, score, cnt = 0;
        int[] cntCountry = new int[n+1];
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            countryNum = Integer.parseInt(st.nextToken());
            studentNum = Integer.parseInt(st.nextToken());
            score = Integer.parseInt(st.nextToken());
            students[i] = new Student(countryNum, studentNum, score);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            if (cnt == 3) break;
            if (cntCountry[students[i].countryNum] > 1) continue;
            cntCountry[students[i].countryNum]++;
            sb.append(students[i]);
            cnt++;
        }
        System.out.println(sb);
    }
}
