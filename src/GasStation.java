import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] dist=new long[n-1];
        long[] city=new long[n];

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n-1;i++)
            dist[i]=Long.parseLong(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++)
            city[i]=Long.parseLong(st.nextToken());

        long total=city[0]*dist[0];
        long minCost=city[0];
        for(int i=1;i<n-1;i++){
            if(minCost>city[i]) minCost=city[i];  // 내림차순으로 계속 더 작은 값 곱하기
            total+=dist[i]*minCost;
        }
        System.out.println(total);
    }
}
