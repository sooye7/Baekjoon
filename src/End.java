import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class End {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int i=666;
        while (true) {
            if (String.valueOf(i).contains("666"))
                N--;
            if (N == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
