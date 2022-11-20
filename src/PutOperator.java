import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PutOperator {
    public static int n;
    public static int[] nums;
    public static char[] op;
    public static int value;
    public static long max;
    public static long min;

    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        nums=new int[n];
        op=new char[n-1];
        visited=new boolean[n-1];
        int opNum=0;
        int index=0;

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++)
            nums[i]=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<4;i++) {
            opNum += Integer.parseInt(st.nextToken());
            while(opNum>0){
                if(i==0)
                    op[index]='+';
                else if(i==1)
                    op[index]='-';
                else if(i==2)
                    op[index]='*';
                else
                    op[index]='/';
                index++;
                opNum--;
            }
        }
        max=0;
        min=9999;


        dfs(0);
        // 값 계산

        System.out.println(max);
        System.out.println(min);
    }

    // 연산자 순서 정의
    public static void dfs(int depth){
        if(depth==0)
            value=nums[0];
        // max, min 구하기
        if(depth==n-1){
            max=Math.max(max,value);
            min=Math.min(min,value);
            return;
        }
        for(int i=0;i<n-1;i++){
            if(!visited[i]){
                System.out.println("v"+value+op[i]+"n"+nums[depth+1]+"de"+depth);
                visited[i]=true;
                // 연산 수행 value
                if(op[i]=='+')
                    value+=nums[depth+1];
                else if(op[i]=='-')
                    value-=nums[depth+1];
                else if(op[i]=='*')
                    value*=nums[depth+1];
                else
                    value/=nums[depth+1];
                System.out.println("value"+value);
                dfs(depth+1);
                visited[i]=false;
            }
        }
    }
}
