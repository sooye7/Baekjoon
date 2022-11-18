import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM4 {
    public static int n;
    public static int m;
    public static int[] arr;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[m];
        sb=new StringBuilder();
        dfs(1,0);
        System.out.println(sb);

    }
    private static void dfs(int r, int depth){
        if(depth==m){
            for(int a:arr)
                sb.append(a).append(" ");
            sb.append("\n");
            return;
        }
        for(int i=r;i<=n;i++){
            arr[depth]=i;
            dfs(i,depth+1);
        }
    }

}
