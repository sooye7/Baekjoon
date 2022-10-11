import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

    private static boolean isPrime(int n){
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
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int sum=0, min=0;
        boolean firstPrimeCheck=false;
        for(int i=M;i<=N;i++){
            if(isPrime(i)) {
                sum += i;
                if(!firstPrimeCheck){
                    firstPrimeCheck=true;
                    min=i;
                }
            }
        }
        if(sum==0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
