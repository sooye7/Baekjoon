import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int num=0;
        int i=0;
        int diff=0;
        // 기준 대각선 라인이 몇번째인지 i 구하기
        while(num<n){
            ++i;
            num+=i;
        }
        diff=n-(num-i);
        if(i%2==0)
            System.out.println(diff+"/"+(i-(diff-1)));
        else
            System.out.println((i-(diff-1))+"/"+diff);
    }
}
