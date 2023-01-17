import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectionOfBall {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String ball=br.readLine();
        int bCnt=0, rCnt=0;
        int min=0;
        for(int i=0;i<n;i++){
            if(ball.charAt(i)=='B')
                bCnt++;
            else
                rCnt++;
        }
        int bMove;
        int rMove;
        if(ball.charAt(n-1)=='B'){
            bMove = bCnt;
            rMove = 0;
            for(int i=n-1;i>=0;i--){
                if(ball.charAt(i)!='B')
                    break;
                bMove--;
            }
            rMove=rCnt;
        }
        else{
            bMove = 0;
            rMove = rCnt;
            for(int i=n-1;i>=0;i--){
                if(ball.charAt(i)!='R')
                    break;
                rMove--;
            }
            bMove=bCnt;
        }
        min=Math.min(rMove, bMove);
        if(ball.charAt(0)=='B'){
            bMove = bCnt;
            rMove = 0;
            for(int i=0;i<n;i++){
                if(ball.charAt(i)!='B')
                    break;
                bMove--;
            }
            rMove=rCnt;
        }
        else{
            bMove = 0;
            rMove = rCnt;
            for(int i=0;i<n;i++){
                if(ball.charAt(i)!='R')
                    break;
                rMove--;
            }
            bMove=bCnt;
        }
        min=Math.min(min, Math.min(rMove, bMove));
        System.out.println(min);
    }
}
