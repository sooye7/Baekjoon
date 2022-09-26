import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PresidentOfWomen {
    public static void countPerson(int k, int n){
        int[][] dp=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            for(int j=1;j<=n;j++){
                if(i==0)
                    dp[i][j]=j;
                else{
                    for(int m=1;m<=j;m++){
                        dp[i][j]+=dp[i-1][m];
                    }
                }
            }
        }
        System.out.println(dp[k][n]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            countPerson(k,n);
        }
    }
}
