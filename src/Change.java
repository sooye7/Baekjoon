import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        while(n%5!=0){
            n-=2;
            count++;
        }
        count+=n/5;
        System.out.println(count);
    }
}
