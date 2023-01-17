import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stock {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            long maxProfit=0;
            long max=0;
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            long[] price=new long[n];
            for(int j=0;j<n;j++)
                price[j]=Integer.parseInt(st.nextToken());
            for(int j=n-1;j>=0;j--){
                if(price[j]>max)
                    max=price[j];
                else
                    maxProfit+=max-price[j];
            }
            System.out.println(maxProfit);
        }
    }
}
