import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonField2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int height=0, width=0;
        int first=0, prior=1, total=0;
        int result=0;
        for(int i=0;i<6;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            int dir=Integer.parseInt(st.nextToken());
            int len=Integer.parseInt(st.nextToken());
            // 전체 직사각형
            if(dir==1||dir==2)
                width=Math.max(width,len);
            else
                height=Math.max(height,len);
            if(i==0) {
                first = len;
                prior=len;
                continue;
            }
            total+=prior*len;
            prior=len;
        }
        total+=first*prior;
        // 인접한 길이 모두 곱하여 구한 넓이 - (직사각형 전체 넓이*2) * 참외개수
        result=(total-width*height*2)*n;
        System.out.println(result);
    }
}
