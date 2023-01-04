import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class CoinZero {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int value=Integer.parseInt(st.nextToken());
        int total=0;
        Integer[] coin=new Integer[n];
        for(int i=0;i<n;i++)
            coin[i]=Integer.parseInt(br.readLine());
        Arrays.sort(coin, Collections.reverseOrder());  // 내림차순 정렬
        for(int c:coin){
            if(c<=value){
                total+=value/c;
                value=value%c;
            }
            if(value==0)
                break;
        }
        System.out.println(total);
    }
}
