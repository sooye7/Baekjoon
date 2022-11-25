import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBLen {
    public static int[][] cost;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        cost=new int[n][3];
        dp=new int[n][3];

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            cost[i][0] = Integer.parseInt(st.nextToken());  //red
            cost[i][1] = Integer.parseInt(st.nextToken());  //green
            cost[i][2] = Integer.parseInt(st.nextToken());  //blue
        }

        dp[0][0]=cost[0][0];
        dp[0][1]=cost[0][1];
        dp[0][2]=cost[0][2];

        System.out.println(Math.min(colorCost(n-1,0),Math.min(colorCost(n-1,1),colorCost(n-1,2))));
    }

    private static int colorCost(int n, int color){
        if(dp[n][color]==0){
            if(color==0)  //red
                dp[n][0]=Math.min(colorCost(n-1,1),colorCost(n-1,2))+cost[n][0];
            else if(color==1)  // green
                dp[n][1]=Math.min(colorCost(n-1,0),colorCost(n-1,2))+cost[n][1];
            else  //blue
                dp[n][2]=Math.min(colorCost(n-1,0),colorCost(n-1,1))+cost[n][2];

        }
        return dp[n][color];
    }
}
