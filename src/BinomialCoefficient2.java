import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[][] dp=new int[n+1][n+1];

        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= i; j++) {
                if(i==j||j==0)
                    dp[i][j]=1;
                else
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
            }
        }
        // dp
        System.out.println(dp[n][k]);

        //System.out.println(comb(n,k)%10007);

    }

    // 재귀
    private static int comb(int n, int k){
        return comb(n-1,k-1)+comb(n-1,k);
    }
}
