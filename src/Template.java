import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Template {
    private static InputReader in;
    private static PrintWriter out;

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        in = new InputReader(inputStream);
        OutputStream outputStream = System.out;
        out = new PrintWriter(outputStream);

        // Read inputs
        int T = in.nextInteger();
        int[] N = new int[T];
        int[] K = new int[T];

        for (int i = 0; i < T; i++) {
            N[i] = in.nextInteger();
            K[i] = in.nextInteger();
        }

        // TODO: Write your code here

        for (int i = 0; i < T; i++) {
            int n = N[i];
            int k = K[i];
            long sum = 0;

            int firstOdd = k;
            int difference = 2 * k;
            int count = n / k;

            if (count > 0) {
                sum = (long) count * (2L * firstOdd + (count - 1L) * difference) / 2L;
            }
            out.println(sum);
        }

        // ! Hint:  Note that to get the full score, you might need to edit other parts of the code as well
        // To print the output, use: out.println();

        // close/flush the output
        out.close();
    }

    // taken from https://codeforces.com/submissions/Petr
    // together with PrintWriter, these input-output (IO) is much faster than the
    // usual Scanner(System.in) and System.out
    // please use these classes to avoid your fast algorithm gets Time Limit
    // Exceeded caused by slow input-output (IO)
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInteger() {
            return Integer.parseInt(next());
        }
    }
}