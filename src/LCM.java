import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            System.out.println(lcm(a,b));
        }

    }
    private static int gcd(int a, int b){
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }
    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
