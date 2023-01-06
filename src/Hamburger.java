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
            int tmp=k;
            if(sb.charAt(i)=='H') continue;
            while(tmp>0){
                if(i-k>=0&&sb.charAt(i-k)=='H'){
                    sb.replace(i-k,i-k+1," ");
                    count++;
                    break;
                }
                else if(i+k<sb.length()&&sb.charAt(i+k)=='H'){
                    sb.replace(i+k,i+k+1," ");
                    count++;
                    break;
                }
                tmp--;
            }
            System.out.println(sb);
        }
        System.out.println(count);
    }
}
