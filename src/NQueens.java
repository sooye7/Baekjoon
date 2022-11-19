import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueens {
    public static int n;
    public static int count;
    public static int[] queens;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        queens=new int[n];
        nQueens(0);
        System.out.println(count);

    }

    private static boolean isPromise(int col){
        for (int i = 0; i < col; i++) {
            if (queens[col] == queens[i])
                return false;
            else if (Math.abs(col - i) == Math.abs(queens[col] - queens[i]))
                return false;
        }

        return true;
    }

    private static void nQueens(int depth){
        if(depth==n){
            count++;
            return;
        }
        for(int i=0;i<n;i++){
            queens[depth]=i;
            if (isPromise(depth))
                nQueens(depth + 1);
        }

    }
}
