import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factoring {
    private static boolean isPrime(int n){
        boolean check=n!=1;
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
        int num=n;
        if(isPrime(n))
            System.out.println(n);
        else{
            for(int i=2;i<=n/2;i++){
                if(isPrime(i)){
                    while(num%i==0) {
                        System.out.println(i);
                        num/=i;
                    }
                }
            }
        }
    }
}
