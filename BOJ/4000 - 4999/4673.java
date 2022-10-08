public class Main {
    public static int d(int n) {
        int sum = n;
        String st = Integer.toString(n);

        for (int i = 0; i < st.length(); i++) {
            sum += Character.getNumericValue(st.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int val = d(i);
            if (val <= 10000) arr[d(i)] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
