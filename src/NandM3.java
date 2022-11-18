import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM3 {
    public static int n;
    public static int m;
    public static int[] arr;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        n=Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());
        arr=new int[m];
        sb=new StringBuilder();
        dfs(0);
        System.out.println(sb);

    }

    private static void dfs(int depth){
        if(depth==m){
            for(int a:arr)
                sb.append(a).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=1;i<=n;i++){
            arr[depth]=i;
            dfs(depth+1);
        }
    }
}
