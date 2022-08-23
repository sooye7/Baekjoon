import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    static int max;
    static int[] numbers;
    static void dfs(int N, int M, int[] card, int depth, int start){
        if(depth==3) {
            int sum=0;
            // 최댓값
            for(int n:numbers)
                sum+=n;
            System.out.println(numbers[0]+" "+numbers[1]+" "+numbers[2]);
            if(sum<=M)
                max=Math.max(max, sum);
            return;
        }
        for(int i=start;i<N;i++) {
            numbers[depth]=card[i];
            dfs(N, M, card, depth + 1, i+1);
        }
    }

    public static void main(String[] args) throws IOException {  // 예외처리 필수
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] card=new int[N];
        numbers=new int[3];
        st=new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<N;i++)
            card[i]=Integer.parseInt(st.nextToken());
        dfs(N, M, card, 0, 0);
        System.out.println(max);
    }
}
