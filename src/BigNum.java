import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigNum {
    public static void sumOfAB(StringBuilder a, StringBuilder b){
        int c=0;
        StringBuilder answer=new StringBuilder();
        a.reverse();
        b.reverse();
        for(int i=0;i<a.length();i++){
            int sum=Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i)));
            if(sum>=10){
                sum-=10;
                answer.append(sum+c);
                c=1;
            }
            else{
                if(sum+c==10){
                    answer.append("0");
                    c=1;
                }
                else{
                    answer.append(sum+c);
                    c=0;
                }
            }
        }
        if(c==1)
            answer.append(c);
        System.out.println(String.valueOf(answer.reverse()));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        StringBuilder a= new StringBuilder(st.nextToken());
        StringBuilder b= new StringBuilder(st.nextToken());
        if(a.length()!=b.length()){
            if(a.length()>b.length()){
                for(int i=0;i<a.length()-b.length();i++){
                    b.insert(0, "0");
                }
            }
            else{
                for(int i=0;i<b.length()-a.length();i++){
                    a.insert(0, "0");
                }
            }
            sumOfAB(a,b);
        }

        else{
            sumOfAB(a,b);
        }
    }
}
