import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleGame2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int count=0;
        int left=1;
        int right=m;

        int appleNum=Integer.parseInt(br.readLine());
        for(int i=0;i<appleNum;i++){
            int apple=Integer.parseInt(br.readLine());
            if(apple<left){
                count+=left-apple;
                left=apple;
                right=apple+m-1;
            }
            else if(apple>right){
                count+=apple-right;
                right=apple;
                left=apple-(m-1);
            }
        }
        System.out.println(count);
    }
}
