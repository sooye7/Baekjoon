import java.io.*;
import java.math.BigInteger;
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
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        StringBuilder a= new StringBuilder(st.nextToken());
        StringBuilder b= new StringBuilder(st.nextToken());
        if(a.length()!=b.length()){
            if(a.length()>b.length()){
                while(b.length()!=a.length()){
                    b.insert(0, "0");
                }
            }
            else {
                while (a.length() != b.length()) {
                    a.insert(0, "0");
                }
            }
            sumOfAB(a,b);
        }
        else{
            sumOfAB(a,b);
        }

        // 풀이 2. BigInteger 객체 사용
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        bw.write(String.valueOf(A.add(B)));
        bw.flush();
        bw.close();

    }
}
