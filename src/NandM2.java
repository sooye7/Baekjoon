import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM2 {
    public static int n;
    public static int m;
    public static boolean[] visited;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        n=Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());
        visited=new boolean[n+1];
        arr=new int[m];
        dfs(1,0);

    }

    private static void dfs(int r, int depth){
        if(depth==m){
            StringBuilder sb=new StringBuilder();
            for(int a:arr)
                sb.append(a).append(" ");
            System.out.println(sb);
            return;
        }

        for(int i=r;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                arr[depth]=i;
                dfs(i+1,depth+1);
                visited[i]=false;
            }
        }
    }
}
