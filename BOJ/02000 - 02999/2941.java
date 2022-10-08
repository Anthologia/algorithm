import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();

        for (String letter : croatianAlphabet) {
            if (word.contains(letter)) {
                word = word.replace(letter, " ");
            }
        }
        System.out.println(word.length());
    }
}