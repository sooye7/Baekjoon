import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hamburger {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        String pos=br.readLine();
        StringBuilder sb=new StringBuilder(pos);
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='H'||sb.charAt(i)==' ') continue;
            int tmp=k;
            int start=i-tmp, end=i+tmp;
            if(i-tmp<0) start=0;
            if(i+tmp>=sb.length()) end=sb.length()-1;
            for(int j=start;j<=end;j++){
                if(sb.charAt(j)=='H'){
                    sb.replace(j,j+1," ");
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
