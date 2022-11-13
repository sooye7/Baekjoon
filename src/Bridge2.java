import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] dp=new int[31][31];

        for(int i=1;i<31;i++)
            dp[i][1]=i;

        for(int i=2;i<31;i++){
            for(int j=2;j<31;j++)
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
        }

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int west=Integer.parseInt(st.nextToken());
            int east=Integer.parseInt(st.nextToken());
            System.out.println(dp[east][west]);
        }
    }

    private static int comb(int n, int r){
        if(n==r||r==0)
            return 1;
        return comb(n-1,r-1)+comb(n-1,r);
    }
}
