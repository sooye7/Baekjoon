import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=1;
        int num=1;
        while(num<n){
            num+=6*count;
            count++;
        }
        System.out.println(count);

    }
}
