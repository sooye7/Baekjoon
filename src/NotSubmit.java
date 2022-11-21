import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean[] nums=new boolean[31];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<28;i++){
            int n=Integer.parseInt(br.readLine());
            nums[n]=true;
        }
        for(int i=1;i<=30;i++){
            if(!nums[i])
                sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
