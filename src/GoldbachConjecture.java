import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture {
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
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            int k=0;
            int min=num;
            for(int j=num/2;j>1;j--){
                if(isPrime(j)&&isPrime(num-j)&&num-2*j<min){
                       min=num-2*j;
                       k=j;
                       break;
                }
            }
            System.out.println(k+" "+(num-k));
        }
    }
}
