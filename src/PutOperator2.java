import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PutOperator2 {
    public static int n;
    public static int[] nums;
    public static int[]op;

    public static long max=Integer.MIN_VALUE;
    public static long min=Integer.MAX_VALUE;

    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        nums=new int[n];
        op=new int[4];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++)
            nums[i]=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<4;i++)
            op[i]=Integer.parseInt(st.nextToken());

        dfs(nums[0],1);
        System.out.println(max);
        System.out.println(min);
    }
    private static void dfs(int num, int depth){
        if(depth==n){
            max=Math.max(max,num);
            min=Math.min(min,num);
            return;
        }
        for(int i=0;i<4;i++){
            if(op[i]>0){
                op[i]--;
                if(i==0)
                    dfs(num+nums[depth],depth+1);
                else if(i==1)
                    dfs(num-nums[depth],depth+1);
                else if(i==2)
                    dfs(num*nums[depth],depth+1);
                else
                    dfs(num/nums[depth],depth+1);
                op[i]++;  // 다시 되돌려놓기
            }
        }
    }
}
