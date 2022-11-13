import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int west=Integer.parseInt(st.nextToken());
            int east=Integer.parseInt(st.nextToken());

            System.out.println(comb(east,west));
        }
    }

    private static int comb(int n, int r){
        if(n==r||r==0)
            return 1;
        return comb(n-1,r-1)+comb(n-1,r);
    }
}
