import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartAndLink2 {
    public static int n;
    public static int[][] arr;
    public static boolean[] visited;
    public static int[] start;
    public static int[] link;
    public static int min=Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n+1][n+1];
        visited=new boolean[n+1];
        start=new int[n/2];
        link=new int[n/2];
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
            int k=0;
            int startSum=0;
            int linkSum=0;
            for(int i=1;i<=n;i++){
                if(!visited[i])
                    link[k++]=i;
            }
            // 능력치 계산
            for(int i=0;i<start.length;i++){
                int sIdx=start[i];
                int lIdx=link[i];
                for(int j=0;j<start.length;j++){
                    startSum+=arr[sIdx][start[j]];
                    linkSum+=arr[lIdx][link[j]];
                }
            }
            min=Math.min(min,Math.abs(startSum-linkSum));
            return;
        }

        for(int i=r;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                start[depth]=i;
                dfs(i+1,depth+1);
                visited[i]=false;
            }
        }
    }
}