import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        boolean[] basket=new boolean[n];
        int count=0;
        for(int i=0;i<m;i++)
            basket[i]=true;
        int appleNum=Integer.parseInt(br.readLine());
        for(int i=0;i<appleNum;i++){
            int num=Integer.parseInt(br.readLine());
            int min=11, index=0;
            for(int j=0;j<n;j++){
                if(basket[j]){
                    if(min>Math.abs(num-1-j)){
                        min=Math.abs(num-1-j);
                        index=j;
                    }
                }
            }
            count+=min;
            basket[index]=false;
            basket[num-1]=true;
        }
        System.out.println(count);
    }
}
