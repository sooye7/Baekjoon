import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecomposeSum {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int M=Integer.parseInt(br.readLine());
        int N=0;
        for(int i=M/2;i<=M;i++){
            int sum=i;
            int num=i;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            if(sum==M) {
                N = i;
                break;
            }
        }
        System.out.println(N);

    }
}
