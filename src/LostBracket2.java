import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LostBracket2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String modification = br.readLine();
        List<Character> op = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < modification.length(); i++) {
            if (!Character.isDigit(modification.charAt(i)))
                op.add(modification.charAt(i));
            else {
                int k = i;
                while (Character.isDigit(modification.charAt(k))) {
                    k++;
                    if (k >= modification.length())
                        break;
                }
                num.add(Integer.parseInt(modification.substring(i, k)));
                i = k - 1;
            }
        }

        for (int i = 0; !op.isEmpty() && i < op.size(); i++) {
            if (op.get(i) == '+') {
                int n = num.get(i) + num.get(i + 1);
                num.set(i, n);
                num.remove(i + 1);
                op.remove(i);
                i--;
            }
        }
        if (!op.isEmpty()) {
            for (int i = 0; !op.isEmpty() && i < op.size(); i++) {
                if (op.get(i) == '-') {
                    int n = num.get(i) - num.get(i + 1);
                    num.set(i, n);
                    num.remove(i + 1);
                    op.remove(i);
                    i--;
                }
            }
        }
        System.out.println(num.get(0));
    }
}
