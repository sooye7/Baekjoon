import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int count=0;

        while(b>0){
            String bStr=String.valueOf(b);
            if(bStr.charAt(bStr.length()-1)=='1') {
                b = Integer.parseInt(bStr.substring(0, bStr.length() - 1));
                count++;
            }
            else if(b%2==0) {
                b /= 2;
                count++;
            }
            else{
                count=-1;
                break;
            }
            if(b<a){
                count=-1;
                break;
            }
            else if(b==a)
                break;
        }
        if(count!=-1)
            count++;
        System.out.println(count);


    }
}
