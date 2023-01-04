import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeToOne {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        int tmp=n;
        int oneCnt=0, twoCnt=0, threeCnt=0;
        while(tmp>1){
            tmp/=3;
            threeCnt++;
        }
        if(threeCnt!=0)
            tmp= (int) (n-Math.pow(3,threeCnt));
        while(tmp>1){
            tmp/=2;
            twoCnt++;
        }
        if(twoCnt!=0&&threeCnt!=0)
            tmp= (n-(int)Math.pow(3,threeCnt)-(int)Math.pow(2,twoCnt));
        else if(twoCnt==0&&threeCnt!=0)
            tmp= (n-(int)Math.pow(3,threeCnt));
        else if(twoCnt!=0&&threeCnt==0)
            tmp= (n-(int)Math.pow(2,twoCnt));
        if(tmp==1) {
            oneCnt++;
        }

        System.out.println(threeCnt+twoCnt+oneCnt);
    }
}
