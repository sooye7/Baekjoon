import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansoo {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=n;
        // 숫자가 99이하이면 해당 숫자 출력
        if(n<=99)
            System.out.println(n);
        else{
            for(int i=100;i<=n;i++){
                int temp=i;
                int prev=temp%10;
                temp/=10;
                int diff=prev-temp%10;
                while(temp>0){
                    int cur=temp%10;
                    temp/=10;
                    if(prev-cur!=diff) {
                        count--;
                        break;
                    }
                    prev=cur;
                }
            }
            System.out.println(count);
        }

    }
}
