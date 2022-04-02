// 프로그래머스 Lv2 프린터

import java.util.*;

class Document {
    int priority;
    int location;

    public Document(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Document> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Document(priorities[i], i));
        }

        int cnt = 1;
        while (!queue.isEmpty()) {
            Document document = queue.poll();
            boolean flag = false;

            for (Document d : queue) {
                if (d.priority > document.priority) flag = true;
            }

            if (flag) {
                queue.add(document);
            } else {
                if (document.location == location) return cnt;
                cnt++;
            }
        }
        return cnt;
    }
}
