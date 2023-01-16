import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blog2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String color=br.readLine();
        String[] rSplit=color.split("R");
        String[] bSplit=color.split("B");

        int bCnt=0;
        int rCnt=0;
        int answer=0;
        for(String b:rSplit){
            if(!b.isEmpty())
                bCnt++;
        }
        for(String r:bSplit){
            if(!r.isEmpty())
                rCnt++;
        }
        if(bCnt>rCnt)
            answer=rCnt+1;
        else
            answer=bCnt+1;

        System.out.println(answer);

    }
}
