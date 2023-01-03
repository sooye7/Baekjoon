import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarf {
    private static int[] arr;
    private static int[] dwarfs;
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        arr=new int[9];
        dwarfs=new int[7];
        answer=new int[7];

        for(int i=0;i<9;i++)
            arr[i]=Integer.parseInt(br.readLine());
        dfs(0,0);
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++)
            System.out.println(answer[i]);
    }

    private static void dfs(int depth, int start){
        if(depth==7){
            int sum=0;
            for(int i=0;i<7;i++)
                sum+=dwarfs[i];
            if(sum==100){
                for(int i=0;i<7;i++)
                    answer[i]=dwarfs[i];
            }
        return;
        }
        for(int i=start;i<9;i++){
            dwarfs[depth]=arr[i];
            dfs(depth+1, i+1);
        }

    }
}
