import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ring {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int ring=Integer.parseInt(st.nextToken());
        for(int i=0;i<n-1;i++){
            int num=Integer.parseInt(st.nextToken());
            int g=gcd(ring,num);
            System.out.println(ring/g+"/"+num/g);
        }


    }

    private static int gcd(int a, int b){
        if(a%b==0)
            return b;
        return gcd(b,a%b);
    }

}
