import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciDP {
    public static int[] f;
    public static int count1;
    public static int count2;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);
        System.out.println(count1+" "+count2);
    }

    private static int fib(int n){
        if(n==1||n==2){
            count1++;
            return 1;
        }
        else
            return fib(n-1)+fib(n-2);
    }

    private static int fibonacci(int n){
        f=new int[n+1];
        f[1]=1;
        f[2]=1;
        for(int i=3;i<=n;i++) {
            count2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
