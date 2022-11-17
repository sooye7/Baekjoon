import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NuberOfZeroComb {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int r=n-k;
        // (n의 2의 지수-(k,r의 2의 지수)
        // (n의 5의 지수)-(k,r의 5의 지수)
        int two=countTwo(n)-(countTwo(k)+countTwo(r));
        int five=countFive(n)-(countFive(k)+countFive(r));
        System.out.println(Math.min(two, five));
    }

    private static int countFive(int n){
        int five=0;
        while(n>0){
            five+=n/5;
            n/=5;
        }
        return five;
    }
    private static int countTwo(int n){
        int two=0;
        while(n>0) {
            two += n / 2;
            n /= 2;
        }
        return two;
    }
}
