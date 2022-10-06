import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int[] dp=new int[n+1];
        int[] defaultArr={-1,-1,-1,1,-1,1,2,-1};  // 7까지 값

        if(n<=7){
            System.out.println(defaultArr[n]);
            return;
        }
        else{
            for(int i=0;i<=7;i++)
                dp[i]=defaultArr[i];

        }
        for(int i=8;i<=n;i++){
            if(dp[i-5]!=-1&&dp[i-3]!=-1)
                dp[i]=1+Math.min(dp[i-3],dp[i-5]);
            else if(dp[i-5]==-1&&dp[i-3]!=-1)
                dp[i]=1+dp[i-3];
            else if(dp[i-5]!=-1&&dp[i-3]==-1)
                dp[i]=1+dp[i-5];
        }
        System.out.println(dp[n]);

    }
}
