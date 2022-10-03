import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine(), " ");
            int H=Integer.parseInt(st.nextToken());
            int W=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int floor=N%H;
            int room=N/H+1;
            // 나머지 0인 경우
            if(floor==0) {
                floor = H;
                room=N/H;
            }
            int answer=floor*100+room;
            System.out.println(answer);
        }
    }
}
