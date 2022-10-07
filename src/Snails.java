import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snails {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int V=Integer.parseInt(st.nextToken());
        int n=0;
        int count=0;
        if((V-A)%(A-B)!=0)
            count=1+(V-A)/(A-B)+1;  // 1은 맨 처음 A가 올라간 횟수
        else
            count=1+(V-A)/(A-B);  // 1은 맨 처음 A가 올라간 횟수

        // 시간 초과
//        while(n<=V){
//            n+=A;
//            count++;
//            if(n>=V)
//                break;
//            n-=B;
//        }
        System.out.println(count);
    }
}
