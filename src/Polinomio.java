import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polinomio {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String board=br.readLine();
        if(board.contains("XXXX"))
            board=board.replaceAll("XXXX","AAAA");
        if(board.contains("XX"))
            board=board.replaceAll("XX","BB");
        if(board.contains("X"))
            System.out.println(-1);
        else
            System.out.println(board);

    }
}
