import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
    public static int[][] map;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        map=new int[n][n];
        dp=new int[n][n];


        for(int i=0;i<n;i++){
            int k=0;
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens())
                map[i][k++]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++)
            dp[n-1][i]=map[n-1][i];

        // 아래에서부터 대각선 요소들 비교하여 큰 값을 더해줌
        for(int i=n-2;i>=0;i--){
            // 같은 열 또는 오른쪽 열 비교해서 최댓값 더하기
            for(int j=0;j<=i;j++)
                dp[i][j] = map[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
        }

        System.out.println(dp[0][0]);  // 맨 꼭대기 값이 결과값
    }
}
