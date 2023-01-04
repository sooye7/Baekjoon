import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PartTimeGangho {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] cost=new int[n];
        long sum=0;
        for(int i=0;i<n;i++)
            cost[i]=Integer.parseInt(br.readLine());

        Arrays.sort(cost);

        for(int i=n-1;i>=0;i--) {
            int tmp= cost[i] - (n - 1 - i);
            if(tmp>=0)
                sum += tmp;
        }

        System.out.println(sum);
    }
}
