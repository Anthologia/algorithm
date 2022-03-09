import java.io.*;
import java.util.*;

class Document {
    private final int originIndex, importance;

    public int getOriginIndex() {
        return originIndex;
    }

    public int getImportance() {
        return importance;
    }

    Document(int originIndex, int importance) {
        this.originIndex = originIndex;
        this.importance = importance;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            LinkedList<Document> queue = new LinkedList<>();
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.offer(new Document(j, Integer.parseInt(st.nextToken())));
            }

            int cnt = 0;
            while (!queue.isEmpty()) {
                Document curDocument = queue.poll();
                boolean isMax = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (curDocument.getImportance() < queue.get(j).getImportance()) {
                        queue.offer(curDocument);
                        for (int k = 0; k < j; k++) {
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(isMax == false) {
                    continue;
                }

                cnt++;
                if(curDocument.getOriginIndex() == m) {
                    break;
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}
