import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatString {
    public static void repeatStr(int count, String str){
        char[] chars=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<count;j++){
                sb.append(chars[i]);
            }
        }
        System.out.println(String.valueOf(sb));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(bf.readLine()," ");
            int count=Integer.parseInt(st.nextToken());
            String str=st.nextToken();
            repeatStr(count, str);
        }
    }
}
