import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        System.out.println(combination(n,k));

    }

    private static int combination(int n, int k){
        if(n==k||k==0)
            return 1;
        else
            return combination(n-1,k-1)+combination(n-1,k);
    }
}
