import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDLCM {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));

    }

    // 최대공약수
    private static int gcd(int a, int b){
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }

    // 최소공배수
    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
