import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartAndLink {
    public static int n;
    public static int[][] arr;
    public static boolean[] visited;
    public static int min=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n+1][n+1];
        visited=new boolean[n+1];
        for(int i=1;i<=n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine(), " ");
            for(int j=1;j<=n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dfs(1,0);
        System.out.println(min);
    }

    // 스타트, 링크 조합
    private static void dfs(int r, int depth){
        if(depth==n/2){
            int startSum=0;
            int linkSum=0;
            // 능력치 계산
            for(int i=1;i<=n-1;i++){
                for(int j=i+1;j<=n;j++){
                    // 링크
                   if(!visited[i]&&!visited[j]) {
                       linkSum += arr[i][j];
                       linkSum += arr[j][i];
                   }
                   // 스타트
                   else if(visited[i]&&visited[j]) {
                       startSum += arr[i][j];
                       startSum += arr[j][i];
                   }
                }
            }
            int result=Math.abs(startSum-linkSum);
            // 차이가 0인 것은 최솟값 의미 -> 0이면 종료
            if(result==0) {
                System.out.println(result);
                System.exit(0);
            }
            min=Math.min(min,result);
            return;
        }

        for(int i=r;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                dfs(r+1,depth+1);
                visited[i]=false;
            }
        }
    }
}
