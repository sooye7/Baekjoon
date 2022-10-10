import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumberCnt {

    public static boolean isPrime(int n){
        boolean check= n != 1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int count=0;
        for(int i=0;i<number;i++){
            int n=Integer.parseInt(st.nextToken());
            if(isPrime(n))
                count++;

        }
        System.out.println(count);
    }
}
