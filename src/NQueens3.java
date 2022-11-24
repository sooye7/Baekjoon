import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueens3 {
    public static int n;
    public static int[] arr;
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n];

        dfs(0);
        System.out.println(count);

    }

    // 유망성 검사
    private static boolean isPromise(int col){
        // 대각선, 같은 열 또는 행에 존재하면 false
        for(int i=0;i<col;i++){
            if(Math.abs(i-col)==Math.abs(arr[i]-arr[col])||arr[i]==arr[col])  // 대각선 또는 같은 행에 존재하는 경우
                return false;
        }
        return true;
    }

    private static void dfs(int depth){
        if(depth==n){
            count++;
            return;
        }

        for(int i=0;i<n;i++){
            arr[depth]=i;  //열, 행
            if(isPromise(depth))
                dfs(depth+1);

        }

    }
}
