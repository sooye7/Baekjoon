import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountPrimeNumber {
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

    private static void countPrime(int n){
        int count=0;
        for(int i=n+1;i<=2*n;i++){
            if(isPrime(i))
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0)
                break;
            countPrime(n);
        }
    }
}
