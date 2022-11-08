import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        // 유클리드 기하학 원
        String ans1=String.format("%.6f",Math.round(r*r*Math.PI*1000000)/1000000.0);
        System.out.println(ans1);

        // 택시 기하학 원
        String ans2=String.format("%.6f",Math.round((double)(r*2)*(r*2)/2*1000000)/1000000.0);
        System.out.println(ans2);

    }
}
